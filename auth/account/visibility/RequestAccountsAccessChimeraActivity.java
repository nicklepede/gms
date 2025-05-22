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
import defpackage.acnu;
import defpackage.afkn;
import defpackage.afle;
import defpackage.auqy;
import defpackage.aura;
import defpackage.aury;
import defpackage.auub;
import defpackage.bp;
import defpackage.ew;
import defpackage.iri;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RequestAccountsAccessChimeraActivity extends afkn {
    public String h;

    @Override // defpackage.afkn
    protected final String gW() {
        return "RequestAccountsAccessActivity";
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!auub.c()) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.auth_request_accounts_access_activity);
        ((TextView) findViewById(R.id.footnote)).setText(getResources().getString(R.string.auth_app_permission_ok_footnote));
        String p = aura.p(this);
        if (p == null) {
            Log.w("Auth", String.format(Locale.US, "[RequestAccountsAccess] componentName of activity is null", new Object[0]));
            setResult(0);
            finish();
            return;
        }
        this.h = p;
        CharSequence b = new acnu(this).b(this.h);
        if (b == null) {
            setResult(0);
            finish();
            return;
        }
        String charSequence = b.toString();
        ew gY = gY();
        if (gY.h("headerFragment") == null) {
            bp bpVar = new bp(gY);
            bpVar.u(R.id.header_fragment_layout, afle.x(charSequence), "headerFragment");
            bpVar.a();
        }
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.auth_request_accounts_list));
        ((LinearLayout) findViewById(R.id.scopes_layout)).addView(textView);
        ((Button) findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: xje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = RequestAccountsAccessChimeraActivity.this;
                requestAccountsAccessChimeraActivity.setResult(0);
                requestAccountsAccessChimeraActivity.finish();
            }
        });
        ((Button) findViewById(R.id.accept_button)).setOnClickListener(new View.OnClickListener() { // from class: xjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean I = fmua.a.lK().I();
                final RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = RequestAccountsAccessChimeraActivity.this;
                if (I) {
                    xdk xdkVar = new xdk(requestAccountsAccessChimeraActivity);
                    final String str = requestAccountsAccessChimeraActivity.h;
                    atfn atfnVar = new atfn();
                    atfnVar.c = new Feature[]{wjo.d};
                    atfnVar.a = new atfd() { // from class: xdc
                        @Override // defpackage.atfd
                        public final void d(Object obj, Object obj2) {
                            int i = xdk.a;
                            ((xcg) ((xdm) obj).H()).e(new xdh((dhma) obj2), str);
                        }
                    };
                    atfnVar.d = 1511;
                    dhlw ji = xdkVar.ji(atfnVar.a());
                    ji.z(new dhlq() { // from class: xjc
                        @Override // defpackage.dhlq
                        public final void gC(Object obj) {
                            RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity2 = RequestAccountsAccessChimeraActivity.this;
                            requestAccountsAccessChimeraActivity2.setResult(-1);
                            requestAccountsAccessChimeraActivity2.finish();
                        }
                    });
                    ji.y(new dhln() { // from class: xjd
                        @Override // defpackage.dhln
                        public final void gB(Exception exc) {
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
        auqy.b(getContainerActivity(), aury.n(getResources()) ? r4.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor) : r4.getDimension(R.dimen.plus_auth_dialog_resize_factor));
        int i = iri.a;
    }
}
