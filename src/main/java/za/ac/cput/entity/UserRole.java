/*  UserRole.java
    Entity for the User Role
 *  Author: Vuyisa Nkangana
 *  Date: 9 June 2021
 */

package za.ac.cput.entity;

public class UserRole {
    private int userId,roleId;

    private UserRole(Builder builder) {
        this.userId = builder.userId;
        this.roleId = builder.roleId;

    }

    @Override
    public String toString() {
        return "BookingHistory{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                + '\'' +
                '}';
    }

    public static class Builder {
        public int roleId;
        private int userId;


        public Builder setUserId(int userId) {
            this.userId = userId;

            return this;
        }

        public Builder setRoleId(int roleId) {
            this.roleId = roleId;

            return this;
        }

        public UserRole build() {
            return new UserRole(this);
        }
        public Builder copy(UserRole UserRole) {
            this.userId = UserRole.userId;
            this.roleId = UserRole.roleId;

            return this;
        }

    }
}
