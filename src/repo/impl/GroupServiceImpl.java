package repo.impl;

import model.Group;
import repo.GroupService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class GroupServiceImpl implements GroupService {

    private List<Group> groups = new ArrayList<>();

    @Override
    public boolean add(Group group) {
        return groups.add(group);
    }

    @Override
    public Group findById(int groupId) {
        return groups.stream()
                .filter(x -> x.getId() == groupId)
                .findFirst()
                .orElse(null);
    }
}
