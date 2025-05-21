package com.google.android.gms.nearby.sharing.sliceprovider;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.google.android.gms.nearby.sharing.sliceprovider.ConsentLaunchChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.arwb;
import defpackage.asvw;
import defpackage.asvx;
import defpackage.asvy;
import defpackage.cmsq;
import defpackage.dfak;
import defpackage.ebna;
import defpackage.eiid;
import defpackage.fqmf;
import defpackage.ilq;
import defpackage.iq;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ConsentLaunchChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final Account account = (Account) ilq.a(getIntent(), "com.google.android.gms.nearby.sharing.ACCOUNT", Account.class);
        if (account == null) {
            return;
        }
        String action = getIntent().getAction();
        if (arwb.b(action, "com.google.android.gms.nearby.sharing.ACTION_ENABLE_DEVICE_CONTACT_CONSENT")) {
            ProgressBar progressBar = new ProgressBar(this);
            progressBar.setIndeterminate(true);
            ebna ebnaVar = new ebna(this);
            ebnaVar.P(progressBar);
            final iq a = ebnaVar.a();
            cmsq.a(this).c(account).z(new dfak() { // from class: crir
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    cmsj cmsjVar = (cmsj) obj;
                    cmfe.a.b().p("Got consent text", new Object[0]);
                    final ConsentLaunchChimeraActivity consentLaunchChimeraActivity = ConsentLaunchChimeraActivity.this;
                    ebna ebnaVar2 = new ebna(consentLaunchChimeraActivity);
                    ebnaVar2.I(new DialogInterface.OnDismissListener() { // from class: crio
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ConsentLaunchChimeraActivity.this.finish();
                        }
                    });
                    ebnaVar2.N(cmsjVar.a);
                    ebnaVar2.C(cmsjVar.b);
                    ebnaVar2.F(cmsjVar.f, new DialogInterface.OnClickListener() { // from class: crip
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ConsentLaunchChimeraActivity.this.finish();
                        }
                    });
                    final Account account2 = account;
                    ebnaVar2.L(cmsjVar.e, new DialogInterface.OnClickListener() { // from class: criq
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            final ConsentLaunchChimeraActivity consentLaunchChimeraActivity2 = ConsentLaunchChimeraActivity.this;
                            dfaq b = cmsq.a(consentLaunchChimeraActivity2).b(account2);
                            b.x(new dfae() { // from class: crim
                                @Override // defpackage.dfae
                                public final void hr(dfaq dfaqVar) {
                                    ConsentLaunchChimeraActivity.this.finish();
                                }
                            });
                            b.y(new dfah() { // from class: crin
                                @Override // defpackage.dfah
                                public final void gm(Exception exc) {
                                    cmfe.a.e().f(exc).p("Failed to enable Device Contact consent.", new Object[0]);
                                }
                            });
                        }
                    });
                    ebnaVar2.a();
                    a.dismiss();
                }
            });
        }
        if (arwb.b(action, "com.google.android.gms.nearby.sharing.ACTION_ENABLE_C11N_CONSENT")) {
            abv registerForActivityResult = registerForActivityResult(new asvw(), new abt() { // from class: cris
                @Override // defpackage.abt
                public final void jq(Object obj) {
                    Intent intent = new Intent("com.google.android.gms.nearby.sharing.ACTION_C11N_CONSENT_RESULT");
                    intent.putExtra("com.google.android.gms.nearby.sharing.C11N_CONSENT_RESULT_CODE", ((aswa) obj).c);
                    ConsentLaunchChimeraActivity consentLaunchChimeraActivity = ConsentLaunchChimeraActivity.this;
                    cfcs.d(consentLaunchChimeraActivity, intent);
                    consentLaunchChimeraActivity.finish();
                }
            });
            asvx a2 = asvy.a();
            a2.g(fqmf.a.a().cJ());
            a2.f(fqmf.a.a().cI());
            a2.a = eiid.j(account.name);
            a2.d(true);
            a2.b(true);
            registerForActivityResult.b(a2.a());
        }
    }
}
