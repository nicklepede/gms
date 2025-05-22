package com.google.android.gms.wallet.dynamite;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.gms.R;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.dynamite.util.c;
import com.google.android.gms.wallet.dynamite.util.o;
import defpackage.bblp;
import defpackage.dkuu;
import defpackage.dkyy;
import defpackage.dkzd;
import defpackage.ekvl;
import defpackage.fwam;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PayButtonCreatorChimeraImpl extends dkuu {
    @Override // defpackage.dkuv
    public bblp newPayButton(bblp bblpVar, ButtonOptions buttonOptions) {
        Context[] contextArr = (Context[]) ObjectWrapper.a(bblpVar);
        ekvl.y(contextArr);
        Context context = contextArr[0];
        ekvl.y(context);
        Context context2 = contextArr[1];
        ekvl.y(context2);
        c.a(context2);
        dkzd dkzdVar = new dkzd(new ContextThemeWrapper(context, buttonOptions.b == 2 ? R.style.PayButtonLightTheme : R.style.PayButtonDarkTheme));
        dkzdVar.a = context2;
        dkzdVar.b = buttonOptions;
        dkyy b = dkzdVar.b();
        if (fwam.f()) {
            int i = o.a;
            if (buttonOptions.a == 9) {
                return new ObjectWrapper(dkzdVar);
            }
        }
        if (o.a(buttonOptions.d)) {
            return new ObjectWrapper(dkzdVar);
        }
        b.f(6, 9, "Integrator has invalid AllowedPaymentMethods");
        return new ObjectWrapper(null);
    }
}
