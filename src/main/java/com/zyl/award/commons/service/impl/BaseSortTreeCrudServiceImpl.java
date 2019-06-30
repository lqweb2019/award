package com.zyl.award.commons.service.impl;

import com.zyl.award.commons.model.po.Node;
import com.zyl.award.commons.model.po.SortTreePO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public abstract class BaseSortTreeCrudServiceImpl<E extends SortTreePO<PK>, PK> extends BaseTreeCurdServiceImpl<E, PK> {

	@Override
	public List<E> selectChildren(PK parentId) {
		List<E> children = super.selectChildren(parentId);

		return children.stream().sorted().collect(Collectors.toList());
	}

	@Override
	public Node<E> selectNodeByParentId(PK parentId) {
		Node<E> node = super.selectNodeByParentId(parentId);
		sortChildrenNode(node);
		return node;
	}

	private void sortChildrenNode(Node<E> node) {
		if (node.getParent() != null && !CollectionUtils.isEmpty(node.getChildren())) {
			List<Node<E>> children = node.getChildren();

			List<Node<E>> sortedChildren = children.stream().sorted((node1, node2) -> {
				E e1 = node1.getParent();
				E e2 = node2.getParent();
				if (e1 == null || e2 == null) {
					throw new NullPointerException();
				}

				return e1.compareTo(e2);
			}).collect(Collectors.toList());

			node.setChildren(sortedChildren);

			sortedChildren.forEach(item -> sortChildrenNode(item));
		}
	}

}
