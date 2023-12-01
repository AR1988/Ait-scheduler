<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### Task:

Develop a system to manage groups, teachers, students, and time slots for lessons.

### Entity Descriptions:

1. **User:**
    - Fields:
        - `id` (unique user identifier)
        - `name` (user's name)
        - `role` (user's role, can be `STUDENT` or `TEACHER`)

2. **Student:**
    - Inherits from `User`
    - Additional fields:
        - `userGroup` (the group to which the student belongs)

3. **Teacher:**
    - Inherits from `User`
    - Additional fields:
        - `teachGroups` (a list of groups taught by the teacher)

4. **Group:**
    - Fields:
        - `id` (unique group identifier)
        - `groupName` (group's name)
        - `users` (a list of users in the group, including both students and teachers)
        - `timeSlots` (a list of time slots for lessons within the group)

5. **TimeSlot:**
    - Fields:
        - `id` (unique time slot identifier)
        - `teacher` (the teacher conducting the lesson)
        - `group` (the group for which the slot is assigned)
        - `startTime` (the date and time when the lesson starts)
        - `endTime` (the date and time when the lesson ends)

### Operations:

1. Adding a new user (`User`).
2. Adding a student to a group and establishing a relationship between them (`Student` and `Group`).
3. Adding a new group (`Group`).
4. Adding a new time slot for a lesson (`TimeSlot`).

### Rules:

1. Each user has a unique identifier (`id`).
2. Groups can include both students and teachers.
3. A teacher can teach multiple groups, and each group can have multiple time slots for lessons.
4. Time slots are determined by `startTime` and `endTime`, where `startTime` is the date and time when the lesson
   starts, and `endTime` is the date and time when the lesson ends.

This is the updated TS that takes into account your changes to the `TimeSlot` class. You can further elaborate on it
with more detailed requirements and functionalities if needed for your project.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Задача:

Разработать систему для управления группами, учителями, студентами и временными слотами занятий.

### Описание сущностей:

1. **User (Пользователь):**
    - Поля:
        - `id` (уникальный идентификатор пользователя)
        - `name` (имя пользователя)
        - `role` (роль пользователя, может быть `STUDENT` или `TEACHER`)

2. **Student (Студент):**
    - Наследует `User`
    - Дополнительные поля:
        - `userGroup` (группа, к которой принадлежит студент)

3. **Teacher (Учитель):**
    - Наследует `User`
    - Дополнительные поля:
        - `teachGroups` (список групп, которые обучает учитель)

4. **Group (Группа):**
    - Поля:
        - `id` (уникальный идентификатор группы)
        - `groupName` (название группы)
        - `users` (список пользователей в группе, как студентов, так и учителей)
        - `timeSlots` (список временных слотов для занятий в группе)

5. **TimeSlot (Временной слот):**
    - Поля:пе
        - `id` (уникальный идентификатор временного слота)
        - `teacher` (учитель, проводящий занятие)
        - `group` (группа, для которой назначен слот)
        - `startTime` (дата и время начала занятия)
        - `endTime` (дата и время окончания занятия)

### Операции:

1. Добавление нового пользователя (`User`).
2. Добавление студента в группу и установление связи между ними (`Student` и `Group`).
3. Добавление новой группы (`Group`).
4. Добавление нового временного слота для занятия (`TimeSlot`).

### Правила:

1. Каждый пользователь имеет уникальный идентификатор (`id`).
2. Группы могут содержать как студентов, так и учителей.
3. Учитель может обучать несколько групп, и каждая группа может иметь несколько временных слотов для занятий.
4. Временные слоты определяются по `startTime` и `endTime`, где `startTime` - это дата и время начала занятия,
   а `endTime` - дата и время окончания занятия.

</details>
