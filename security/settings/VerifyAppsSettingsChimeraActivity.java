package com.google.android.gms.security.settings;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.anxn;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.asrw;
import defpackage.assk;
import defpackage.assn;
import defpackage.assp;
import defpackage.assr;
import defpackage.byhr;
import defpackage.cxzr;
import defpackage.cyrt;
import defpackage.cyry;
import defpackage.cyse;
import defpackage.cywj;
import defpackage.cywk;
import defpackage.cywt;
import defpackage.cywu;
import defpackage.cywv;
import defpackage.cyww;
import defpackage.cywx;
import defpackage.cywz;
import defpackage.cyxd;
import defpackage.cyxi;
import defpackage.cyxj;
import defpackage.cyxk;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.frtq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class VerifyAppsSettingsChimeraActivity extends cywk implements asrw, cyxi {
    public static final /* synthetic */ int x = 0;
    private static final String y = "com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity";
    private static final asot z = asot.b(VerifyAppsSettingsChimeraActivity.class.getCanonicalName(), asej.SECURITY);
    private cyxk A;
    private boolean B;
    private boolean C;
    private boolean D;
    private long E;
    private List F;
    public cxzr j;
    cywj k;
    cywt l;
    cywt m;
    cywt n;
    cyxk o;
    cyse p;
    public long t;
    public boolean u;
    public boolean v;
    public PackageManager w;
    public int r = -1;
    public int s = -1;
    private boolean G = false;
    private final ExecutorService H = new asmf(2, 9);

    private final void x(assr assrVar) {
        new byhr().post(new cywx(this, assrVar));
    }

    private final boolean y() {
        Intent n = cyry.n(this, 3);
        ComponentName component = n.getComponent();
        if (component != null && component.getClassName().equals(cyrt.c(VerifyAppsSettingsChimeraActivity.class))) {
            return false;
        }
        try {
            startActivity(n);
            return true;
        } catch (ActivityNotFoundException e) {
            ((ejhf) ((ejhf) ((ejhf) z.i()).s(e)).ah((char) 9572)).x("Could not open Play Protect Home");
            return true;
        }
    }

    private final void z() {
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("gpp_home_user_entry_point")) {
            return;
        }
        intent.getIntExtra("gpp_home_user_entry_point", 0);
    }

    public final Map m() {
        int i;
        String str;
        PackageInfo packageInfo;
        List<ResolveInfo> queryIntentActivities = this.w.queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.applicationInfo != null && (str = resolveInfo.activityInfo.packageName) != null && !hashSet.contains(str)) {
                try {
                    packageInfo = this.w.getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    Long valueOf = Long.valueOf(packageInfo.lastUpdateTime);
                    if (!hashMap.containsKey(valueOf)) {
                        hashMap.put(valueOf, new HashMap());
                        arrayList.add(valueOf);
                    }
                    ((Map) hashMap.get(valueOf)).put(str, packageInfo);
                    hashSet.add(str);
                }
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Long l = (Long) arrayList.get(i2);
            l.longValue();
            linkedHashMap.put(l, new ArrayList());
            ArrayList arrayList2 = new ArrayList(((Map) hashMap.get(l)).keySet());
            Collections.sort(arrayList2);
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size2) {
                    ((List) linkedHashMap.get(l)).add((PackageInfo) ((Map) hashMap.get(l)).get((String) arrayList2.get(i3)));
                    i3++;
                }
            }
            i2 = i;
        }
        return linkedHashMap;
    }

    public final synchronized void n(boolean z2) {
        if (this.u) {
            return;
        }
        this.u = true;
        this.H.execute(new cywz(this, z2));
    }

    @Override // defpackage.cyxi
    public final void o() {
        this.j.b(false);
        v();
    }

    @Override // defpackage.anxn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        if (frtq.l() && y()) {
            this.G = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        if (this.p == null) {
            this.p = new cyse(this);
        }
        super.onCreate(bundle);
        this.w = getPackageManager();
        hy().o(true);
        this.H.execute(new cywu(this));
        if (frtq.o()) {
            z();
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        try {
            this.H.shutdownNow();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (frtq.o()) {
            setIntent(intent);
            z();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.security_apps_help) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        }
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 1;
        themeSettings.b = getColor(R.color.material_blue_grey_700);
        l(eits.l("isVerifyAppsVisible", "true"), themeSettings);
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        this.j = new cxzr(this);
        this.t = System.currentTimeMillis();
        v();
        n(false);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        if (z2) {
            v();
        }
    }

    @Override // defpackage.asrw
    public final void p(View view, assp asspVar) {
        if (!asspVar.equals(this.A)) {
            if (asspVar.equals(this.o)) {
                cxzr.a(this, "upload_apk_enable", !((assr) this.o).h ? 1 : 0);
                v();
                x(this.o);
                return;
            }
            return;
        }
        if (((assr) this.A).h && !this.j.k(this)) {
            new cyxj().show(getSupportFragmentManager(), "disable_verify_apps_confirmation_dialog");
            return;
        }
        if (frtq.a.a().aj()) {
            boolean z2 = ((assr) this.A).h;
            this.j.b(!z2);
            v();
            if (!z2) {
                this.v = true;
                n(true);
            }
        } else {
            this.j.b(!((assr) this.A).h);
            v();
        }
        x(this.A);
    }

    @Override // defpackage.anxn
    protected final void q(assn assnVar) {
        if (this.G) {
            return;
        }
        assk asskVar = assnVar.a;
        cyxk cyxkVar = new cyxk(this);
        cyry.m(cyxkVar, this, 5, R.string.verify_apps_title);
        this.A = cyxkVar;
        cyxkVar.p(R.string.verify_apps_summary);
        asskVar.k(this.A);
        cywt cywtVar = new cywt(this);
        cywtVar.o(0);
        cywtVar.r(R.string.play_protect_banner);
        cywtVar.i = k(R.drawable.play_protect_ic_logo_40dp);
        cywtVar.h();
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://support.google.com/googleplay/answer/2812853"));
        if (s(data)) {
            cywtVar.u(getText(R.string.common_learn_more));
            cywtVar.h = new cywv(this, data);
        }
        asskVar.k(cywtVar);
        cywt cywtVar2 = new cywt(this);
        cyry.m(cywtVar2, null, 2, R.string.play_protect_disabled_title);
        this.m = cywtVar2;
        cywtVar2.p(R.string.play_protect_disabled_summary);
        this.m.k(a(R.drawable.play_protect_ic_alert_black_24dp, R.color.material_google_red_500));
        cywt cywtVar3 = new cywt(this);
        cyry.m(cywtVar3, null, 2, R.string.play_protect_all_clear_title);
        this.l = cywtVar3;
        cywtVar3.p(R.string.play_protect_all_clear_summary);
        this.l.k(a(R.drawable.play_protect_ic_check_black_24dp, R.color.material_google_green_500));
        if (this.p.a >= 80832200) {
            cywt cywtVar4 = this.l;
            Drawable a = a(R.drawable.play_protect_ic_rescan_black_24dp, R.color.material_google_green_500);
            cywtVar4.r = new cyww(this);
            cywtVar4.j = a;
            cywtVar4.h();
        }
        cywt cywtVar5 = new cywt(this);
        cyry.m(cywtVar5, null, 2, R.string.play_protect_all_clear_title);
        this.n = cywtVar5;
        cywtVar5.p(R.string.play_protect_scan_in_progress_subtitle);
        this.n.k(a(R.drawable.play_protect_ic_check_black_24dp, R.color.material_google_green_500));
        cywt cywtVar6 = this.n;
        cywtVar6.q = true;
        cywtVar6.h();
        cyxk cyxkVar2 = new cyxk(this);
        cyry.m(cyxkVar2, this, 6, R.string.upload_apps_title);
        this.o = cyxkVar2;
        cyxkVar2.j = false;
        cyxkVar2.h();
        asskVar.k(this.o);
    }

    public final synchronized void t(long j, List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (j == this.E && list.equals(this.F)) {
                    return;
                }
                if (this.k == null) {
                    cywj cywjVar = new cywj(this);
                    this.k = cywjVar;
                    cywjVar.o(1);
                    this.k.s(getText(R.string.verify_apps_recently_scanned));
                    ((anxn) this).q.a.k(this.k);
                }
                this.k.q(cyse.a(this, j));
                ArrayList arrayList = new ArrayList(list);
                Collections.shuffle(arrayList, new Random(j));
                if (this.F == null) {
                    cywj cywjVar2 = this.k;
                    cywjVar2.k = false;
                    cywjVar2.j = arrayList;
                    cywjVar2.h();
                } else {
                    cywj cywjVar3 = this.k;
                    cywjVar3.k = true;
                    cywjVar3.j = arrayList;
                    cywjVar3.h();
                }
                this.F = list;
                this.E = j;
                return;
            }
        }
        this.k = null;
    }

    public final void u(int i) {
        runOnUiThread(new cyxd(this, i));
    }

    public final void v() {
        boolean c = this.j.c();
        assk asskVar = ((anxn) this).q.a;
        if (!c) {
            cywt cywtVar = this.m;
            if (cywtVar != null && !this.B) {
                asskVar.k(cywtVar);
                this.B = true;
            }
        } else if (this.B) {
            asskVar.m(this.m);
            this.B = false;
        }
        if (!c || this.r != 0 || this.s != 0) {
            if (this.C) {
                asskVar.m(this.l);
                this.C = false;
            }
            if (this.D) {
                asskVar.m(this.n);
                this.D = false;
            }
        } else if (this.v) {
            cywt cywtVar2 = this.n;
            if (cywtVar2 != null && !this.D) {
                asskVar.k(cywtVar2);
                this.D = true;
                if (this.C) {
                    asskVar.m(this.l);
                    this.C = false;
                }
            }
        } else {
            cywt cywtVar3 = this.l;
            if (cywtVar3 != null) {
                if (!this.C) {
                    asskVar.k(cywtVar3);
                    this.C = true;
                }
                if (this.D) {
                    asskVar.m(this.n);
                    this.D = false;
                }
            }
        }
        this.A.setChecked(c);
        this.A.i(this.j.i());
        cyxk cyxkVar = this.o;
        if (cyxkVar != null) {
            cyxkVar.setChecked(c && cxzr.e(this));
            this.o.i(c);
            this.o.p(c ? R.string.upload_apps_summary : R.string.upload_apps_disabled_summary);
        }
    }
}
