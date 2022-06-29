package bctwozerotwotwo.bootcamp.base.project.api.core.service;


import com.ontimize.jee.common.dto.EntityResult;
import java.util.List;
import java.util.Map;


public interface IUserService {

  EntityResult userQuery(Map<?, ?> keyMap, List<?> attrList);

  EntityResult userInsert(Map<?, ?> attrMap);

  EntityResult userUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap);

  EntityResult userDelete(Map<?, ?> keyMap);

}
