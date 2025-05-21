package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.asmf;
import defpackage.dtmk;
import defpackage.dtyl;
import defpackage.dtyz;
import defpackage.dujr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GoogleAccountAvatar extends FrameLayout {
    public final AccountParticleDisc a;

    public GoogleAccountAvatar(Context context) {
        super(context);
        AccountParticleDisc accountParticleDisc = new AccountParticleDisc(context);
        this.a = accountParticleDisc;
        a(context, accountParticleDisc);
    }

    private static void a(Context context, AccountParticleDisc accountParticleDisc) {
        dtyl dtylVar = new dtyl();
        asmf asmfVar = new asmf(1, 9);
        Context applicationContext = context.getApplicationContext();
        Context applicationContext2 = context.getApplicationContext();
        dujr dujrVar = new dujr();
        dujrVar.a = asmfVar;
        accountParticleDisc.i(new dtmk(applicationContext, asmfVar, dtylVar, new dtyz(applicationContext2, dujrVar.a())), dtylVar);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        addView(this.a);
    }

    public GoogleAccountAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AccountParticleDisc accountParticleDisc = new AccountParticleDisc(context, attributeSet);
        this.a = accountParticleDisc;
        a(context, accountParticleDisc);
    }

    public GoogleAccountAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AccountParticleDisc accountParticleDisc = new AccountParticleDisc(context, attributeSet, i);
        this.a = accountParticleDisc;
        a(context, accountParticleDisc);
    }
}
