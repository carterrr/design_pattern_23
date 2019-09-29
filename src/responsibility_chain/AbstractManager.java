package responsibility_chain;

/**
 * @author CarterChou at 2019/4/26 15:59
 * @description
 */
public abstract class AbstractManager {
    /**
     * @author CarterChou at 2019/4/26 00:20
     * @description
     */

        protected String name;

        /**
         * 上级
         */
        protected AbstractManager superior;

        public AbstractManager(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSuperior(AbstractManager superior) {
            this.superior = superior;
        }

        abstract void requsetApplications(Request request);

}
