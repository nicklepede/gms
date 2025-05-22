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
import defpackage.acno;
import defpackage.acnp;
import defpackage.aczm;
import defpackage.adau;
import defpackage.aflg;
import defpackage.aflh;
import defpackage.afln;
import defpackage.aurd;
import defpackage.bp;
import defpackage.euzu;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fmua;
import defpackage.iri;
import defpackage.jzx;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BrowserConsentChimeraActivity extends afln implements aflg {
    public static final acno h = new acno("account");
    public static final acno i = new acno("url");
    public static final acno j = new acno("cookies");
    private aflh k;

    private final void o() {
        gT(0, new Intent().putExtra(ConsentResult.a, new ConsentResult(adau.PERMISSION_DENIED, null, null, aczm.REJECTED, null)));
    }

    @Override // defpackage.aflg
    public final jzx b() {
        return jzx.a(this);
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "BrowserConsentActivity";
    }

    @Override // defpackage.aflg
    public final void j(String str) {
        if (str == null) {
            Log.w("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult was null.", new Object[0]));
            o();
            return;
        }
        Intent intent = new Intent();
        try {
            byte[] f = aurd.f(str);
            fgri y = fgri.y(euzu.a, f, 0, f.length, fgqp.a());
            fgri.M(y);
            if (!((euzu) y).b) {
                Log.i("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult cookie present, but consent was not granted.", new Object[0]));
                o();
            } else {
                intent.putExtra(ConsentResult.a, new ConsentResult(adau.SUCCESS, aczm.GRANTED, str));
                gT(-1, intent);
            }
        } catch (fgsd | IllegalArgumentException unused) {
            Log.w("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult cookie string present, but was invalid and could not be parsed.", new Object[0]));
            o();
        }
    }

    @Override // defpackage.aflg
    public final void l() {
        o();
    }

    @Override // defpackage.aflg
    public final void n(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        CustomWebView customWebView = this.k.b;
        if (customWebView.canGoBack()) {
            customWebView.goBack();
        } else {
            o();
            super.onBackPressed();
        }
    }

    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aflh aflhVar = (aflh) gY().h("browser");
        this.k = aflhVar;
        if (aflhVar == null) {
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
            aflh aflhVar2 = new aflh();
            acnp acnpVar = new acnp();
            acnpVar.d(aflh.c, account);
            acnpVar.d(aflh.d, str);
            acnpVar.d(aflh.ag, browserResolutionCookieArr);
            aflhVar2.setArguments(acnpVar.a);
            this.k = aflhVar2;
            bp bpVar = new bp(gY());
            bpVar.u(R.id.content, this.k, "browser");
            bpVar.a();
        }
        if (fmua.a.lK().m()) {
            int i3 = iri.a;
        }
    }
}
