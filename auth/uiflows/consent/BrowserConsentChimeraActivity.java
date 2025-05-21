package com.google.android.gms.auth.uiflows.consent;

import android.R;
import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.login.CustomWebView;
import defpackage.aano;
import defpackage.aanp;
import defpackage.aazm;
import defpackage.abau;
import defpackage.adkz;
import defpackage.adla;
import defpackage.adlg;
import defpackage.asnj;
import defpackage.bp;
import defpackage.eskh;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fkdo;
import defpackage.ips;
import defpackage.jti;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BrowserConsentChimeraActivity extends adlg implements adkz {
    public static final aano h = new aano("account");
    public static final aano i = new aano("url");
    public static final aano j = new aano("cookies");
    private adla k;

    private final void o() {
        gD(0, new Intent().putExtra(ConsentResult.a, new ConsentResult(abau.PERMISSION_DENIED, null, null, aazm.REJECTED, null)));
    }

    @Override // defpackage.adkz
    public final jti b() {
        return jti.a(this);
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "BrowserConsentActivity";
    }

    @Override // defpackage.adkz
    public final void j(String str) {
        if (str == null) {
            Log.w("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult was null.", new Object[0]));
            o();
            return;
        }
        Intent intent = new Intent();
        try {
            byte[] f = asnj.f(str);
            fecp y = fecp.y(eskh.a, f, 0, f.length, febw.a());
            fecp.M(y);
            if (!((eskh) y).b) {
                Log.i("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult cookie present, but consent was not granted.", new Object[0]));
                o();
            } else {
                intent.putExtra(ConsentResult.a, new ConsentResult(abau.SUCCESS, aazm.GRANTED, str));
                gD(-1, intent);
            }
        } catch (fedk | IllegalArgumentException unused) {
            Log.w("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult cookie string present, but was invalid and could not be parsed.", new Object[0]));
            o();
        }
    }

    @Override // defpackage.adkz
    public final void l() {
        o();
    }

    @Override // defpackage.adkz
    public final void n(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        CustomWebView customWebView = this.k.b;
        if (customWebView.canGoBack()) {
            customWebView.goBack();
        } else {
            o();
            super.onBackPressed();
        }
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        adla adlaVar = (adla) gI().h("browser");
        this.k = adlaVar;
        if (adlaVar == null) {
            Parcelable[] parcelableArr = (Parcelable[]) s().a(j);
            BrowserResolutionCookie[] browserResolutionCookieArr = new BrowserResolutionCookie[0];
            if (parcelableArr != null) {
                browserResolutionCookieArr = new BrowserResolutionCookie[parcelableArr.length];
                for (int i2 = 0; i2 < parcelableArr.length; i2++) {
                    browserResolutionCookieArr[i2] = (BrowserResolutionCookie) parcelableArr[i2];
                }
            }
            Account account = (Account) s().a(h);
            String str = (String) s().a(i);
            adla adlaVar2 = new adla();
            aanp aanpVar = new aanp();
            aanpVar.d(adla.c, account);
            aanpVar.d(adla.d, str);
            aanpVar.d(adla.ag, browserResolutionCookieArr);
            adlaVar2.setArguments(aanpVar.a);
            this.k = adlaVar2;
            bp bpVar = new bp(gI());
            bpVar.u(R.id.content, this.k, "browser");
            bpVar.a();
        }
        if (fkdo.a.a().l()) {
            int i3 = ips.a;
        }
    }
}
