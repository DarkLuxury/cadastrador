import br.com.contmatic.empresa.*;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.joda.time.DateTime;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;

public class Main {
    public static void main(String[] args) {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa.fixturefactorytemplates");

        Endereco endereco = Fixture.from(Endereco.class).gimme("endereco");
        Endereco endereco1 = Fixture.from(Endereco.class).gimme("endereco");

        Validation validation = new Validation();

        int i = 0;

        Preconditions.checkNotNull(endereco, "Endereço não pode ser nulo");
        Preconditions.checkArgument(i >= 0, "Argument was but expected nonnegative", i);

        System.out.println(endereco.getTipo());
        System.out.println(endereco.getCidade());

    }
}
