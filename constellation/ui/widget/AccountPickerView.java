package com.google.android.gms.constellation.ui.widget;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.constellation.ui.widget.AccountPickerView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.auad;
import defpackage.aupz;
import defpackage.avph;
import defpackage.avqj;
import defpackage.dvww;
import defpackage.dwiv;
import defpackage.dwiw;
import defpackage.dwix;
import defpackage.dwjl;
import defpackage.dwtr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AccountPickerView extends FrameLayout {
    public static final /* synthetic */ int a = 0;
    private static final auad b = avqj.a("account_picker");
    private TextView c;
    private AccountParticleDisc d;

    public AccountPickerView(Context context) {
        super(context);
    }

    public final void a(Account account) {
        AccountParticleDisc accountParticleDisc = this.d;
        if (accountParticleDisc == null) {
            return;
        }
        dwiw dwiwVar = (dwiw) accountParticleDisc.k;
        if (dwiwVar == null || !TextUtils.equals(account.name, dwiwVar.c)) {
            b.d("Setting account: %s", account.name);
            AccountParticleDisc accountParticleDisc2 = this.d;
            dwiv a2 = dwiw.a();
            a2.b(account.name);
            accountParticleDisc2.m(a2.a());
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(account.name);
            }
        }
    }

    public final void b(final Runnable runnable) {
        super.setOnClickListener(new View.OnClickListener() { // from class: avou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AccountPickerView.a;
                runnable.run();
            }
        });
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.account_name);
        this.d = (AccountParticleDisc) findViewById(R.id.account_particle_disc);
        dwix dwixVar = new dwix();
        aupz aupzVar = new aupz(1, 9);
        Context context = getContext();
        Context context2 = getContext();
        avph.d();
        Context context3 = getContext();
        dwtr dwtrVar = new dwtr();
        dwtrVar.b(context3);
        dwtrVar.b = aupzVar;
        this.d.i(new dvww(context, aupzVar, dwixVar, new dwjl(context2, dwtrVar.a())), dwixVar);
    }

    public AccountPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
