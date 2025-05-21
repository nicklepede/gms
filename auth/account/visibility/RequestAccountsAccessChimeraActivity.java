package com.google.android.gms.auth.account.visibility;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.auth.account.visibility.RequestAccountsAccessChimeraActivity;
import com.google.android.gms.auth.account.visibility.WhitelistApplicationForGoogleAccountsIntentOperation;
import com.google.android.gms.common.Feature;
import defpackage.aanu;
import defpackage.adkg;
import defpackage.adkx;
import defpackage.asne;
import defpackage.asng;
import defpackage.asoe;
import defpackage.asqh;
import defpackage.bp;
import defpackage.ew;
import defpackage.ips;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RequestAccountsAccessChimeraActivity extends adkg {
    public String h;

    @Override // defpackage.adkg
    protected final String gG() {
        return "RequestAccountsAccessActivity";
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!asqh.c()) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.auth_request_accounts_access_activity);
        ((TextView) findViewById(R.id.footnote)).setText(getResources().getString(R.string.auth_app_permission_ok_footnote));
        String p = asng.p(this);
        if (p == null) {
            Log.w("Auth", String.format(Locale.US, "[RequestAccountsAccess] componentName of activity is null", new Object[0]));
            setResult(0);
            finish();
            return;
        }
        this.h = p;
        CharSequence b = new aanu(this).b(this.h);
        if (b == null) {
            setResult(0);
            finish();
            return;
        }
        String charSequence = b.toString();
        ew gI = gI();
        if (gI.h("headerFragment") == null) {
            bp bpVar = new bp(gI);
            bpVar.u(R.id.header_fragment_layout, adkx.x(charSequence), "headerFragment");
            bpVar.a();
        }
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.auth_request_accounts_list));
        ((LinearLayout) findViewById(R.id.scopes_layout)).addView(textView);
        ((Button) findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: vnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = RequestAccountsAccessChimeraActivity.this;
                requestAccountsAccessChimeraActivity.setResult(0);
                requestAccountsAccessChimeraActivity.finish();
            }
        });
        ((Button) findViewById(R.id.accept_button)).setOnClickListener(new View.OnClickListener() { // from class: vne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean I = fkdo.a.a().I();
                final RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = RequestAccountsAccessChimeraActivity.this;
                if (I) {
                    vhj vhjVar = new vhj(requestAccountsAccessChimeraActivity);
                    final String str = requestAccountsAccessChimeraActivity.h;
                    arcy arcyVar = new arcy();
                    arcyVar.c = new Feature[]{unp.d};
                    arcyVar.a = new arco() { // from class: vhb
                        @Override // defpackage.arco
                        public final void d(Object obj, Object obj2) {
                            int i = vhj.a;
                            ((vgf) ((vhl) obj).H()).e(new vhg((dfau) obj2), str);
                        }
                    };
                    arcyVar.d = 1511;
                    dfaq iT = vhjVar.iT(arcyVar.a());
                    iT.z(new dfak() { // from class: vnb
                        @Override // defpackage.dfak
                        public final void gn(Object obj) {
                            RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity2 = RequestAccountsAccessChimeraActivity.this;
                            requestAccountsAccessChimeraActivity2.setResult(-1);
                            requestAccountsAccessChimeraActivity2.finish();
                        }
                    });
                    iT.y(new dfah() { // from class: vnc
                        @Override // defpackage.dfah
                        public final void gm(Exception exc) {
                            Log.w("Auth", String.format(Locale.US, "[RequestAccountsAccess] Failed to whitelist package", new Object[0]), exc);
                            RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity2 = RequestAccountsAccessChimeraActivity.this;
                            requestAccountsAccessChimeraActivity2.setResult(0);
                            requestAccountsAccessChimeraActivity2.finish();
                        }
                    });
                    return;
                }
                requestAccountsAccessChimeraActivity.setResult(-1);
                String str2 = requestAccountsAccessChimeraActivity.h;
                Intent startIntent = IntentOperation.getStartIntent(requestAccountsAccessChimeraActivity, WhitelistApplicationForGoogleAccountsIntentOperation.class, "com.google.android.gms.auth.account.visibility.WHITELIST_APPLICATION");
                if (startIntent != null) {
                    startIntent.putExtra("calling_package", str2);
                }
                if (startIntent != null) {
                    requestAccountsAccessChimeraActivity.startService(startIntent);
                } else {
                    Log.w("Auth", String.format(Locale.US, "[RequestAccountsAccess] IntentOperation null", new Object[0]));
                }
                requestAccountsAccessChimeraActivity.finish();
            }
        });
        asne.b(getContainerActivity(), asoe.n(getResources()) ? r4.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor) : r4.getDimension(R.dimen.plus_auth_dialog_resize_factor));
        int i = ips.a;
    }
}
