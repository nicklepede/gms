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
import defpackage.arxo;
import defpackage.asmf;
import defpackage.atle;
import defpackage.atmg;
import defpackage.dtmk;
import defpackage.dtyj;
import defpackage.dtyk;
import defpackage.dtyl;
import defpackage.dtyz;
import defpackage.dujf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AccountPickerView extends FrameLayout {
    public static final /* synthetic */ int a = 0;
    private static final arxo b = atmg.a("account_picker");
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
        dtyk dtykVar = (dtyk) accountParticleDisc.k;
        if (dtykVar == null || !TextUtils.equals(account.name, dtykVar.c)) {
            b.d("Setting account: %s", account.name);
            AccountParticleDisc accountParticleDisc2 = this.d;
            dtyj a2 = dtyk.a();
            a2.b(account.name);
            accountParticleDisc2.m(a2.a());
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(account.name);
            }
        }
    }

    public final void b(final Runnable runnable) {
        super.setOnClickListener(new View.OnClickListener() { // from class: atkr
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
        dtyl dtylVar = new dtyl();
        asmf asmfVar = new asmf(1, 9);
        Context context = getContext();
        Context context2 = getContext();
        atle.d();
        Context context3 = getContext();
        dujf dujfVar = new dujf();
        dujfVar.b(context3);
        dujfVar.b = asmfVar;
        this.d.i(new dtmk(context, asmfVar, dtylVar, new dtyz(context2, dujfVar.a())), dtylVar);
    }

    public AccountPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
