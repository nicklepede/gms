package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.aupz;
import defpackage.dvww;
import defpackage.dwix;
import defpackage.dwjl;
import defpackage.dwud;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        dwix dwixVar = new dwix();
        aupz aupzVar = new aupz(1, 9);
        Context applicationContext = context.getApplicationContext();
        Context applicationContext2 = context.getApplicationContext();
        dwud dwudVar = new dwud();
        dwudVar.a = aupzVar;
        accountParticleDisc.i(new dvww(applicationContext, aupzVar, dwixVar, new dwjl(applicationContext2, dwudVar.a())), dwixVar);
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
