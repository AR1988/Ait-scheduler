package repo;

import model.Group;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public interface GroupService {


    boolean add(Group user);

    Group findById(int groupId);
}
