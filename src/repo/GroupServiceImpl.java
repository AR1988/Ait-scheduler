package repo;

import model.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class GroupServiceImpl implements GroupService {

    List<Group> groups = new ArrayList<>();

    @Override
    public boolean add(Group user) {
        return groups.add(user);
    }

    @Override
    public Group findById(int groupId) {
        return groups.stream()
                .filter(gr -> gr.getId() == groupId)
                .findFirst()
                .orElse(null);
    }
}
