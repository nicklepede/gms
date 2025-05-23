package com.google.android.gms.notifications;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.google.android.gms.R;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.auub;
import defpackage.caqj;
import defpackage.cuih;
import defpackage.cuim;
import defpackage.cuit;
import defpackage.cuiu;
import defpackage.cuiv;
import defpackage.cujd;
import defpackage.eirv;
import defpackage.eirz;
import defpackage.eish;
import defpackage.eisi;
import defpackage.eisj;
import defpackage.eluo;
import defpackage.fthh;
import defpackage.ind;
import defpackage.jzw;
import defpackage.kaj;
import defpackage.ryt;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GunsBrowserChimeraActivity extends ryt implements jzw, cuit {
    public static final ausn j = ausn.b("GunsBrowserChimeraActivity", auid.GUNS);
    private static final IntentFilter o = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
    public final Set k;
    public WebView l;
    public boolean m;
    public ProgressBar n;
    private final Set p;
    private eirz q;
    private eisi r;
    private cuiu s;
    private boolean t;
    private String u;
    private GunsSmsReceiver v;
    private Handler w;

    public GunsBrowserChimeraActivity() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList("adssettings.google.com", "myaccount.google.com", "security.google.com", "www.google.com", "accounts.google.com", "accounts.google.net", "accounts.google.org", "accounts.google.biz", "accounts.google.info", "accounts.google.mobi", "accounts.google.name", "accounts.google.pro", "accounts.google.us", "accounts.google.ag", "accounts.google.ba", "accounts.google.ca", "accounts.google.co.cr", "accounts.google.co.uk", "accounts.g.cn", "accounts.google.cn", "accounts.google.com.cn", "accounts.guge.com", "accounts.guge.com.cn", "accounts.guge.cn", "accounts.googel.cn", "accounts.xn--flW351E.cn", "accounts.google.al", "accounts.google.org.uk", "accounts.google.cl", "accounts.google.de", "accounts.google.ec", "accounts.google.ee", "accounts.google.fi", "accounts.google.fr", "accounts.google.gd", "accounts.google.ge", "accounts.google.gy", "accounts.google.com.gy", "accounts.google.ie", "accounts.google.in", "accounts.google.net.in", "accounts.google.org.in", "accounts.google.it", "accounts.google.co.nz", "accounts.google.org.nz", "accounts.google.net.nz", "accounts.google.co.at", "accounts.google.com.af", "accounts.google.org.af", "accounts.google.at", "accounts.google.com.au", "accounts.google.com.br", "accounts.google.com.gt", "accounts.google.com.mx", "accounts.google.mx", "accounts.google.co.ma", "accounts.google.jobs", "accounts.google.cz", "accounts.google.hu", "accounts.google.co.hu", "accounts.google.nl", "accounts.google.is", "accounts.google.dk", "accounts.google.pf", "accounts.google.com.pg", "accounts.google.pl", "accounts.google.com.pl", "accounts.google.com.ph", "accounts.google.com.pr", "accounts.google.ro", "accounts.google.se", "accounts.google.ch", "accounts.google.gm", "accounts.xn--2e0b0k.kr", "accounts.google.co.kr", "accounts.google.kr", "accounts.google.jp", "accounts.google.co.jp", "accounts.google.ne.jp", "accounts.google.co.je", "accounts.google.com.ar", "accounts.google.am", "accounts.google.be", "accounts.google.fm", "accounts.google.tv", "accounts.google.vg", "accounts.google.bi", "accounts.google.cc", "accounts.google.cd", "accounts.google.co.il", "accounts.google.kz", "accounts.google.la", "accounts.google.lv", "accounts.google.lt", "accounts.google.md", "accounts.google.mw", "accounts.google.mr", "accounts.google.ms", "accounts.google.nr", "accounts.google.nu", "accounts.google.ps", "accounts.google.com.ps", "accounts.google.com.nf", "accounts.google.com.pa", "accounts.google.com.py", "accounts.google.ru", "accounts.google.com.ru", "accounts.xn--c1aay4a.xn--p1ai", "accounts.google.rw", "accounts.google.sh", "accounts.google.com.ec", "accounts.google.co.gg", "accounts.google.li", "accounts.google.com.ua", "accounts.google.ua", "accounts.google.co.ua", "accounts.google.as", "accounts.google.ws", "accounts.google.sg", "accounts.google.co.th", "accounts.google.ae", "accounts.google.gr", "accounts.google.com.gr", "accounts.google.no", "accounts.google.com.pt", "accounts.google.pt", "accounts.google.com.sg", "accounts.google.io", "accounts.google.td", "accounts.google.tw", "accounts.google.com.hk", "accounts.google.hk", "accounts.google.com.pe", "accounts.google.com.tw", "accounts.google.je", "accounts.google.com.tr", "accounts.google.ac", "accounts.google.ad", "accounts.google.it.ao", "accounts.google.aw", "accounts.google.az", "accounts.google.bf", "accounts.google.bg", "accounts.google.bj", "accounts.google.bm", "accounts.google.bn", "accounts.google.bo", "accounts.google.bs", "accounts.google.bt", "accounts.google.by", "accounts.google.bz", "accounts.google.cat", "accounts.google.cf", "accounts.google.cg", "accounts.google.ci", "accounts.google.cm", "accounts.google.co.ao", "accounts.google.co.ba", "accounts.google.co.bi", "accounts.google.co.bw", "accounts.google.co.ci", "accounts.google.co.ck", "accounts.google.co.gl", "accounts.google.co.gy", "accounts.google.co.id", "accounts.google.co.im", "accounts.google.co.in", "accounts.google.co.it", "accounts.google.co.ke", "accounts.google.co.ls", "accounts.google.co.mu", "accounts.google.co.mw", "accounts.google.co.mz", "accounts.google.co.pn", "accounts.google.co.rs", "accounts.google.co.tt", "accounts.google.co.tz", "accounts.google.co.ug", "accounts.google.co.uz", "accounts.google.co.ve", "accounts.google.co.vi", "accounts.google.co.za", "accounts.google.co.zm", "accounts.google.co.zw", "accounts.google.com.ag", "accounts.google.com.ai", "accounts.google.com.az", "accounts.google.com.bd", "accounts.google.com.bh", "accounts.google.com.bi", "accounts.google.com.bn", "accounts.google.com.bo", "accounts.google.com.bs", "accounts.google.com.by", "accounts.google.com.bz", "accounts.google.com.cy", "accounts.google.com.dz", "accounts.google.com.eg", "accounts.google.com.er", "accounts.google.com.et", "accounts.google.com.ge", "accounts.google.com.gh", "accounts.google.com.gi", "accounts.google.com.gl", "accounts.google.com.gp", "accounts.google.com.hn", "accounts.google.com.hr", "accounts.google.com.ht", "accounts.google.com.iq", "accounts.google.com.jm", "accounts.google.com.jo", "accounts.google.com.kg", "accounts.google.com.kh", "accounts.google.com.ki", "accounts.google.com.kw", "accounts.google.com.kz", "accounts.google.com.lb", "accounts.google.com.lc", "accounts.google.com.lk", "accounts.google.com.lv", "accounts.google.com.ly", "accounts.google.com.mk", "accounts.google.com.mm", "accounts.google.com.mt", "accounts.google.com.mu", "accounts.google.com.mw", "accounts.google.com.my", "accounts.google.com.na", "accounts.google.com.nc", "accounts.google.com.ng", "accounts.google.com.ni", "accounts.google.com.np", "accounts.google.com.nr", "accounts.google.com.om", "accounts.google.com.pk", "accounts.google.com.qa", "accounts.google.com.sa", "accounts.google.com.sb", "accounts.google.com.sc", "accounts.google.com.sl", "accounts.google.com.sv", "accounts.google.com.tj", "accounts.google.com.tm", "accounts.google.com.tn", "accounts.google.com.tt", "accounts.google.com.uy", "accounts.google.com.uz", "accounts.google.com.vc", "accounts.google.com.vi", "accounts.google.com.vn", "accounts.google.com.ws", "accounts.google.com.cu", "accounts.google.cv", "accounts.google.cx", "accounts.google.dj", "accounts.google.dm", "accounts.google.do", "accounts.google.dz", "accounts.google.es", "accounts.google.eu", "accounts.google.nom.es", "accounts.google.org.es", "accounts.google.ga", "accounts.google.gf", "accounts.google.gg", "accounts.google.gl", "accounts.google.gp", "accounts.google.gw", "accounts.google.hn", "accounts.google.hr", "accounts.google.ht", "accounts.google.im", "accounts.google.in.rs", "accounts.google.iq", "accounts.google.jo", "accounts.google.kg", "accounts.google.ki", "accounts.google.km", "accounts.google.kn", "accounts.google.lk", "accounts.google.lu", "accounts.google.ma", "accounts.google.me", "accounts.google.mg", "accounts.google.mh", "accounts.google.mk", "accounts.google.ml", "accounts.google.mn", "accounts.google.mu", "accounts.google.mv", "accounts.google.ne", "accounts.google.nf", "accounts.google.ng", "accounts.google.off.ai", "accounts.google.ph", "accounts.google.pk", "accounts.google.pn", "accounts.google.pr", "accounts.google.qa", "accounts.google.re", "accounts.google.rs", "accounts.google.sc", "accounts.google.si", "accounts.google.sk", "accounts.google.sl", "accounts.google.sm", "accounts.google.sn", "accounts.google.so", "accounts.google.sr", "accounts.google.st", "accounts.google.sz", "accounts.google.tk", "accounts.google.tg", "accounts.google.tm", "accounts.google.tn", "accounts.google.to", "accounts.google.tt", "accounts.google.ug", "accounts.google.uz", "accounts.google.vc", "accounts.google.vn", "accounts.google.vu", "accounts.google.yt", "accounts.google.af", "accounts.google.com.ve", "accounts.google.tel", "accounts.google.tp", "accounts.google.tl", "accounts.google.com.do", "accounts.google.com.co", "accounts.google.com.fj", "accounts.youtube.com", "access.workspace.google.com"));
        fthh fthhVar = fthh.a;
        for (String str : cuih.a(fthhVar.lK().d())) {
            if (p(str)) {
                hashSet.add(str);
            }
        }
        Iterator it = cuih.a(fthhVar.lK().f()).iterator();
        while (it.hasNext()) {
            hashSet.remove((String) it.next());
        }
        this.p = hashSet;
        HashSet hashSet2 = new HashSet();
        for (String str2 : cuih.a(fthhVar.lK().h())) {
            if (p(str2)) {
                hashSet2.add(str2);
            }
        }
        for (String str3 : cuih.a(fthhVar.lK().g())) {
            if (p(str3)) {
                hashSet2.add(str3);
            }
        }
        this.k = hashSet2;
    }

    private final String l() {
        eirz eirzVar = this.q;
        if (eirzVar == null) {
            return null;
        }
        eirv eirvVar = eirzVar.d;
        if (eirvVar == null) {
            eirvVar = eirv.a;
        }
        if (eirvVar.d.isEmpty()) {
            return null;
        }
        eirv eirvVar2 = this.q.d;
        if (eirvVar2 == null) {
            eirvVar2 = eirv.a;
        }
        return eirvVar2.d;
    }

    private final String m() {
        eisi eisiVar = this.r;
        if (eisiVar == null) {
            return null;
        }
        eisj eisjVar = eisiVar.c;
        if (eisjVar == null) {
            eisjVar = eisj.a;
        }
        if (eisjVar.b.isEmpty()) {
            return null;
        }
        eisj eisjVar2 = this.r.c;
        if (eisjVar2 == null) {
            eisjVar2 = eisj.a;
        }
        if (!eisjVar2.c || TextUtils.isEmpty(this.u)) {
            return null;
        }
        eisj eisjVar3 = this.r.c;
        if (eisjVar3 == null) {
            eisjVar3 = eisj.a;
        }
        return eisjVar3.b;
    }

    private final void n(Intent intent) {
        String str = this.u;
        String m = m();
        String l = l();
        this.q = cuiv.a(intent);
        this.r = cuiv.b(intent);
        this.u = intent.getStringExtra("com.google.android.gms.notifications.intents.accountName");
        String m2 = m();
        String l2 = l();
        if (!auqx.n(getApplicationContext(), this.u)) {
            finish();
            return;
        }
        if (m == null || str == null || l == null || !str.equals(this.u) || !m.equals(m2) || !l.equals(l2)) {
            if (TextUtils.isEmpty(m2)) {
                ((eluo) j.i()).x("Trying to navigate to null/empty url/accountname");
                finish();
                return;
            } else if (!k(m2)) {
                f(m2);
                return;
            } else {
                this.m = false;
                getSupportLoaderManager().e(0);
                getSupportLoaderManager().c(0, null, this);
            }
        }
        String string = getString(R.string.guns_lock_screen_content_title);
        eirz eirzVar = this.q;
        if (eirzVar != null) {
            eish eishVar = eirzVar.f;
            if (eishVar == null) {
                eishVar = eish.a;
            }
            if (!eishVar.s.isEmpty()) {
                eish eishVar2 = this.q.f;
                if (eishVar2 == null) {
                    eishVar2 = eish.a;
                }
                string = eishVar2.s;
            }
        }
        setTaskDescription(new ActivityManager.TaskDescription(string));
    }

    private final void o(String str) {
        CookieManager.getInstance().removeAllCookie();
        if (TextUtils.isEmpty(str)) {
            str = m();
        }
        this.l.loadUrl(str);
    }

    private static boolean p(String str) {
        return !TextUtils.isEmpty(str) && Patterns.DOMAIN_NAME.matcher(str).matches();
    }

    @Override // defpackage.jzw
    public final kaj a(int i, Bundle bundle) {
        if (i != 0) {
            return null;
        }
        String m = m();
        if (TextUtils.isEmpty(m)) {
            return null;
        }
        return new cujd(this, this.u, m);
    }

    @Override // defpackage.jzw
    public final /* bridge */ /* synthetic */ void b(kaj kajVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        if (kajVar.getId() != 0) {
            return;
        }
        if (bundle.getBoolean("WebLoginUrlLoader.hadError", false)) {
            o(null);
        } else {
            o(bundle.getString("WebloginUrlLoader.authenticatedUrl"));
        }
        getSupportLoaderManager().e(0);
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
        if (str.equals(m())) {
            h(false);
            finish();
        }
    }

    public final void g(final String str) {
        if (this.l != null) {
            this.w.post(new Runnable() { // from class: cuii
                @Override // java.lang.Runnable
                public final void run() {
                    GunsBrowserChimeraActivity.this.l.loadUrl("javascript:".concat(str));
                }
            });
        }
    }

    public final void h(boolean z) {
        if (!z) {
            if (this.t) {
                this.l.removeJavascriptInterface("mm");
                unregisterReceiver(this.v);
                this.t = false;
                return;
            }
            return;
        }
        if (this.t) {
            return;
        }
        if (this.s == null) {
            this.s = new cuiu(this, this, this.l);
        }
        this.l.addJavascriptInterface(this.s, "mm");
        ind.b(this, this.v, o, 2);
        this.t = true;
    }

    public final boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Set set = this.p;
        return set != null && set.contains(parse.getHost()) && "https".equals(parse.getScheme());
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.l.canGoBack()) {
            this.l.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w = new caqj();
        setContentView(R.layout.guns_web_view);
        WebView webView = (WebView) findViewById(R.id.gunsWebView);
        this.l = webView;
        WebSettings settings = webView.getSettings();
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportZoom(true);
        settings.setUserAgentString(String.valueOf(settings.getUserAgentString()).concat(" GnotsGcoreWebView/1.1"));
        if (auub.a()) {
            settings.setDisabledActionModeMenuItems(7);
        }
        this.l.setWebViewClient(new cuim(this));
        this.n = (ProgressBar) findViewById(R.id.gunsProgressBar);
        this.s = null;
        this.t = false;
        this.v = new GunsSmsReceiver(this.l);
        n(getIntent());
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        n(intent);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        if (this.t) {
            unregisterReceiver(this.v);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (this.t) {
            ind.b(this, this.v, o, 2);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStop() {
        super.onStop();
        if (this.m) {
            finish();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.jzw
    public final void c(kaj kajVar) {
    }
}
