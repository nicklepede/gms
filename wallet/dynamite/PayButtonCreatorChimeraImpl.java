package com.google.android.gms.wallet.dynamite;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.gms.R;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.dynamite.util.c;
import com.google.android.gms.wallet.dynamite.util.o;
import defpackage.azht;
import defpackage.dijk;
import defpackage.dinn;
import defpackage.dins;
import defpackage.eiig;
import defpackage.ftey;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PayButtonCreatorChimeraImpl extends dijk {
    @Override // defpackage.dijl
    public azht newPayButton(azht azhtVar, ButtonOptions buttonOptions) {
        Context[] contextArr = (Context[]) ObjectWrapper.a(azhtVar);
        eiig.x(contextArr);
        Context context = contextArr[0];
        eiig.x(context);
        Context context2 = contextArr[1];
        eiig.x(context2);
        c.a(context2);
        dins dinsVar = new dins(new ContextThemeWrapper(context, buttonOptions.b == 2 ? R.style.PayButtonLightTheme : R.style.PayButtonDarkTheme));
        dinsVar.a = context2;
        dinsVar.b = buttonOptions;
        dinn b = dinsVar.b();
        if (ftey.f()) {
            int i = o.a;
            if (buttonOptions.a == 9) {
                return new ObjectWrapper(dinsVar);
            }
        }
        if (o.a(buttonOptions.d)) {
            return new ObjectWrapper(dinsVar);
        }
        b.f(6, 9, "Integrator has invalid AllowedPaymentMethods");
        return new ObjectWrapper(null);
    }
}
