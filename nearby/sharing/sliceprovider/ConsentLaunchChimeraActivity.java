package com.google.android.gms.nearby.sharing.sliceprovider;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.google.android.gms.nearby.sharing.sliceprovider.ConsentLaunchChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.atyq;
import defpackage.auzv;
import defpackage.auzw;
import defpackage.auzx;
import defpackage.cpay;
import defpackage.dhlq;
import defpackage.edzp;
import defpackage.ekvi;
import defpackage.ftga;
import defpackage.ing;
import defpackage.iq;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ConsentLaunchChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final Account account = (Account) ing.a(getIntent(), "com.google.android.gms.nearby.sharing.ACCOUNT", Account.class);
        if (account == null) {
            return;
        }
        String action = getIntent().getAction();
        if (atyq.b(action, "com.google.android.gms.nearby.sharing.ACTION_ENABLE_DEVICE_CONTACT_CONSENT")) {
            ProgressBar progressBar = new ProgressBar(this);
            progressBar.setIndeterminate(true);
            edzp edzpVar = new edzp(this);
            edzpVar.P(progressBar);
            final iq a = edzpVar.a();
            cpay.a(this).c(account).z(new dhlq() { // from class: ctrv
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    cpar cparVar = (cpar) obj;
                    conm.a.b().p("Got consent text", new Object[0]);
                    final ConsentLaunchChimeraActivity consentLaunchChimeraActivity = ConsentLaunchChimeraActivity.this;
                    edzp edzpVar2 = new edzp(consentLaunchChimeraActivity);
                    edzpVar2.I(new DialogInterface.OnDismissListener() { // from class: ctrs
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ConsentLaunchChimeraActivity.this.finish();
                        }
                    });
                    edzpVar2.N(cparVar.a);
                    edzpVar2.C(cparVar.b);
                    edzpVar2.F(cparVar.f, new DialogInterface.OnClickListener() { // from class: ctrt
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ConsentLaunchChimeraActivity.this.finish();
                        }
                    });
                    final Account account2 = account;
                    edzpVar2.L(cparVar.e, new DialogInterface.OnClickListener() { // from class: ctru
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            final ConsentLaunchChimeraActivity consentLaunchChimeraActivity2 = ConsentLaunchChimeraActivity.this;
                            dhlw b = cpay.a(consentLaunchChimeraActivity2).b(account2);
                            b.x(new dhlk() { // from class: ctrq
                                @Override // defpackage.dhlk
                                public final void hH(dhlw dhlwVar) {
                                    ConsentLaunchChimeraActivity.this.finish();
                                }
                            });
                            b.y(new dhln() { // from class: ctrr
                                @Override // defpackage.dhln
                                public final void gB(Exception exc) {
                                    conm.a.e().f(exc).p("Failed to enable Device Contact consent.", new Object[0]);
                                }
                            });
                        }
                    });
                    edzpVar2.a();
                    a.dismiss();
                }
            });
        }
        if (atyq.b(action, "com.google.android.gms.nearby.sharing.ACTION_ENABLE_C11N_CONSENT")) {
            aca registerForActivityResult = registerForActivityResult(new auzv(), new aby() { // from class: ctrw
                @Override // defpackage.aby
                public final void jF(Object obj) {
                    Intent intent = new Intent("com.google.android.gms.nearby.sharing.ACTION_C11N_CONSENT_RESULT");
                    intent.putExtra("com.google.android.gms.nearby.sharing.C11N_CONSENT_RESULT_CODE", ((auzz) obj).c);
                    ConsentLaunchChimeraActivity consentLaunchChimeraActivity = ConsentLaunchChimeraActivity.this;
                    chke.d(consentLaunchChimeraActivity, intent);
                    consentLaunchChimeraActivity.finish();
                }
            });
            auzw a2 = auzx.a();
            ftga ftgaVar = ftga.a;
            a2.b = ftgaVar.lK().cN();
            a2.c = ftgaVar.lK().cM();
            a2.a = ekvi.j(account.name);
            a2.d(true);
            a2.b(true);
            registerForActivityResult.b(a2.a());
        }
    }
}
