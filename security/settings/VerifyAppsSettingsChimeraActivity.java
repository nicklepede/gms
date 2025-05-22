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
import defpackage.apzf;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auvq;
import defpackage.auwe;
import defpackage.auwh;
import defpackage.auwj;
import defpackage.auwl;
import defpackage.caqj;
import defpackage.dajo;
import defpackage.dbbr;
import defpackage.dbbw;
import defpackage.dbcc;
import defpackage.dbgh;
import defpackage.dbgi;
import defpackage.dbgr;
import defpackage.dbgs;
import defpackage.dbgt;
import defpackage.dbgu;
import defpackage.dbgv;
import defpackage.dbgx;
import defpackage.dbhb;
import defpackage.dbhg;
import defpackage.dbhh;
import defpackage.dbhi;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.fuoj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class VerifyAppsSettingsChimeraActivity extends dbgi implements auvq, dbhg {
    public static final /* synthetic */ int x = 0;
    private static final String y = "com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity";
    private static final ausn z = ausn.b(VerifyAppsSettingsChimeraActivity.class.getCanonicalName(), auid.SECURITY);
    private dbhi A;
    private boolean B;
    private boolean C;
    private boolean D;
    private long E;
    private List F;
    public dajo j;
    dbgh k;
    dbgr l;
    dbgr m;
    dbgr n;
    dbhi o;
    dbcc p;
    public long t;
    public boolean u;
    public boolean v;
    public PackageManager w;
    public int r = -1;
    public int s = -1;
    private boolean G = false;
    private final ExecutorService H = new aupz(2, 9);

    private final void x(auwl auwlVar) {
        new caqj().post(new dbgv(this, auwlVar));
    }

    private final boolean y() {
        Intent n = dbbw.n(this, 3);
        ComponentName component = n.getComponent();
        if (component != null && component.getClassName().equals(dbbr.c(VerifyAppsSettingsChimeraActivity.class))) {
            return false;
        }
        try {
            startActivity(n);
            return true;
        } catch (ActivityNotFoundException e) {
            ((eluo) ((eluo) ((eluo) z.i()).s(e)).ai((char) 9574)).x("Could not open Play Protect Home");
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
        this.H.execute(new dbgx(this, z2));
    }

    @Override // defpackage.dbhg
    public final void o() {
        this.j.b(false);
        v();
    }

    @Override // defpackage.apzf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        if (fuoj.l() && y()) {
            this.G = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        if (this.p == null) {
            this.p = new dbcc(this);
        }
        super.onCreate(bundle);
        this.w = getPackageManager();
        hO().o(true);
        this.H.execute(new dbgs(this));
        if (fuoj.o()) {
            z();
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        try {
            this.H.shutdownNow();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (fuoj.o()) {
            setIntent(intent);
            z();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
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
        l(elgx.l("isVerifyAppsVisible", "true"), themeSettings);
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        this.j = new dajo(this);
        this.t = System.currentTimeMillis();
        v();
        n(false);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        if (z2) {
            v();
        }
    }

    @Override // defpackage.auvq
    public final void p(View view, auwj auwjVar) {
        if (!auwjVar.equals(this.A)) {
            if (auwjVar.equals(this.o)) {
                dajo.a(this, "upload_apk_enable", !((auwl) this.o).h ? 1 : 0);
                v();
                x(this.o);
                return;
            }
            return;
        }
        if (((auwl) this.A).h && !this.j.k(this)) {
            new dbhh().show(getSupportFragmentManager(), "disable_verify_apps_confirmation_dialog");
            return;
        }
        if (fuoj.a.lK().aj()) {
            boolean z2 = ((auwl) this.A).h;
            this.j.b(!z2);
            v();
            if (!z2) {
                this.v = true;
                n(true);
            }
        } else {
            this.j.b(!((auwl) this.A).h);
            v();
        }
        x(this.A);
    }

    @Override // defpackage.apzf
    protected final void q(auwh auwhVar) {
        if (this.G) {
            return;
        }
        auwe auweVar = auwhVar.a;
        dbhi dbhiVar = new dbhi(this);
        dbbw.m(dbhiVar, this, 5, R.string.verify_apps_title);
        this.A = dbhiVar;
        dbhiVar.p(R.string.verify_apps_summary);
        auweVar.k(this.A);
        dbgr dbgrVar = new dbgr(this);
        dbgrVar.o(0);
        dbgrVar.r(R.string.play_protect_banner);
        dbgrVar.i = k(R.drawable.play_protect_ic_logo_40dp);
        dbgrVar.h();
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://support.google.com/googleplay/answer/2812853"));
        if (s(data)) {
            dbgrVar.u(getText(R.string.common_learn_more));
            dbgrVar.h = new dbgt(this, data);
        }
        auweVar.k(dbgrVar);
        dbgr dbgrVar2 = new dbgr(this);
        dbbw.m(dbgrVar2, null, 2, R.string.play_protect_disabled_title);
        this.m = dbgrVar2;
        dbgrVar2.p(R.string.play_protect_disabled_summary);
        this.m.k(a(R.drawable.play_protect_ic_alert_black_24dp, R.color.material_google_red_500));
        dbgr dbgrVar3 = new dbgr(this);
        dbbw.m(dbgrVar3, null, 2, R.string.play_protect_all_clear_title);
        this.l = dbgrVar3;
        dbgrVar3.p(R.string.play_protect_all_clear_summary);
        this.l.k(a(R.drawable.play_protect_ic_check_black_24dp, R.color.material_google_green_500));
        if (this.p.a >= 80832200) {
            dbgr dbgrVar4 = this.l;
            Drawable a = a(R.drawable.play_protect_ic_rescan_black_24dp, R.color.material_google_green_500);
            dbgrVar4.r = new dbgu(this);
            dbgrVar4.j = a;
            dbgrVar4.h();
        }
        dbgr dbgrVar5 = new dbgr(this);
        dbbw.m(dbgrVar5, null, 2, R.string.play_protect_all_clear_title);
        this.n = dbgrVar5;
        dbgrVar5.p(R.string.play_protect_scan_in_progress_subtitle);
        this.n.k(a(R.drawable.play_protect_ic_check_black_24dp, R.color.material_google_green_500));
        dbgr dbgrVar6 = this.n;
        dbgrVar6.q = true;
        dbgrVar6.h();
        dbhi dbhiVar2 = new dbhi(this);
        dbbw.m(dbhiVar2, this, 6, R.string.upload_apps_title);
        this.o = dbhiVar2;
        dbhiVar2.j = false;
        dbhiVar2.h();
        auweVar.k(this.o);
    }

    public final synchronized void t(long j, List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (j == this.E && list.equals(this.F)) {
                    return;
                }
                if (this.k == null) {
                    dbgh dbghVar = new dbgh(this);
                    this.k = dbghVar;
                    dbghVar.o(1);
                    this.k.s(getText(R.string.verify_apps_recently_scanned));
                    ((apzf) this).q.a.k(this.k);
                }
                this.k.q(dbcc.a(this, j));
                ArrayList arrayList = new ArrayList(list);
                Collections.shuffle(arrayList, new Random(j));
                if (this.F == null) {
                    dbgh dbghVar2 = this.k;
                    dbghVar2.k = false;
                    dbghVar2.j = arrayList;
                    dbghVar2.h();
                } else {
                    dbgh dbghVar3 = this.k;
                    dbghVar3.k = true;
                    dbghVar3.j = arrayList;
                    dbghVar3.h();
                }
                this.F = list;
                this.E = j;
                return;
            }
        }
        this.k = null;
    }

    public final void u(int i) {
        runOnUiThread(new dbhb(this, i));
    }

    public final void v() {
        boolean c = this.j.c();
        auwe auweVar = ((apzf) this).q.a;
        if (!c) {
            dbgr dbgrVar = this.m;
            if (dbgrVar != null && !this.B) {
                auweVar.k(dbgrVar);
                this.B = true;
            }
        } else if (this.B) {
            auweVar.m(this.m);
            this.B = false;
        }
        if (!c || this.r != 0 || this.s != 0) {
            if (this.C) {
                auweVar.m(this.l);
                this.C = false;
            }
            if (this.D) {
                auweVar.m(this.n);
                this.D = false;
            }
        } else if (this.v) {
            dbgr dbgrVar2 = this.n;
            if (dbgrVar2 != null && !this.D) {
                auweVar.k(dbgrVar2);
                this.D = true;
                if (this.C) {
                    auweVar.m(this.l);
                    this.C = false;
                }
            }
        } else {
            dbgr dbgrVar3 = this.l;
            if (dbgrVar3 != null) {
                if (!this.C) {
                    auweVar.k(dbgrVar3);
                    this.C = true;
                }
                if (this.D) {
                    auweVar.m(this.n);
                    this.D = false;
                }
            }
        }
        this.A.setChecked(c);
        this.A.i(this.j.i());
        dbhi dbhiVar = this.o;
        if (dbhiVar != null) {
            dbhiVar.setChecked(c && dajo.e(this));
            this.o.i(c);
            this.o.p(c ? R.string.upload_apps_summary : R.string.upload_apps_disabled_summary);
        }
    }
}
