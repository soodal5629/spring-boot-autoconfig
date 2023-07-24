package hello.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 동적으로 String 배열에 담아서 return 가능
        return new String [] {"hello.selector.HelloConfig"};
    }
}
