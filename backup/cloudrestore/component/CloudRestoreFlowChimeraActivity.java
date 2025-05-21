package com.google.android.gms.backup.cloudrestore.component;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.backup.cloudrestore.component.CloudRestoreFlowChimeraActivity;
import com.google.android.gms.backup.cloudrestore.migrate.service.ContactsBackupInfo;
import defpackage.ahiw;
import defpackage.ahmo;
import defpackage.ahna;
import defpackage.ahnb;
import defpackage.ahnc;
import defpackage.ahnd;
import defpackage.ahne;
import defpackage.ahnf;
import defpackage.ahng;
import defpackage.ahnh;
import defpackage.ahni;
import defpackage.ahnj;
import defpackage.ahnn;
import defpackage.ahnp;
import defpackage.ahns;
import defpackage.ahnw;
import defpackage.ahny;
import defpackage.ahnz;
import defpackage.ahoe;
import defpackage.ahoh;
import defpackage.ahoi;
import defpackage.ahoj;
import defpackage.ahoo;
import defpackage.ahou;
import defpackage.ahov;
import defpackage.ahox;
import defpackage.ahoy;
import defpackage.ahpi;
import defpackage.ahpk;
import defpackage.ahpm;
import defpackage.ahpo;
import defpackage.ahwd;
import defpackage.ahwj;
import defpackage.aief;
import defpackage.aies;
import defpackage.arni;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asiu;
import defpackage.asmf;
import defpackage.bp;
import defpackage.bqna;
import defpackage.byhr;
import defpackage.dfaq;
import defpackage.dnle;
import defpackage.eiig;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ekjg;
import defpackage.ekjl;
import defpackage.ekjp;
import defpackage.ekjq;
import defpackage.ensv;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.flkv;
import defpackage.iln;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CloudRestoreFlowChimeraActivity extends ahmo implements ahou, ahny, ahox, ahoh, ahne {
    public static final ahwd n = new ahwd("CloudRestoreFlow");
    private ContactsBackupInfo A;
    private String B;
    private long C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private Handler I;
    private Runnable J;
    private long K;
    private AsyncTask L;
    private AsyncTask M;
    public ahnn o;
    public List p;
    public Map q;
    public ahpo r;
    public arni s;
    public long t;
    public ahns u;
    private ahnj v;
    private boolean w;
    private boolean x;
    private Map z;
    private final ahnd y = new ahnd(this);
    private final ensv N = new asmf(1, 9);

    private final int F() {
        Map map = this.z;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    private final void G() {
        this.z = null;
        this.A = null;
        this.p = null;
        HashMap hashMap = new HashMap();
        this.q = hashMap;
        hashMap.put(3, false);
        this.q.put(1, false);
        this.q.put(2, false);
    }

    private final void H(Map map) {
        ahna ahnaVar = new ahna(this, this, map);
        this.L = ahnaVar;
        ahnaVar.executeOnExecutor(this.N, new Void[0]);
    }

    private final void I(long j) {
        ahnb ahnbVar = new ahnb(this);
        this.J = ahnbVar;
        if (j <= 0) {
            this.I.post(ahnbVar);
            this.K = SystemClock.elapsedRealtime();
        } else {
            this.I.postDelayed(ahnbVar, j);
            this.K = SystemClock.elapsedRealtime() + j;
        }
    }

    private static boolean J(ContactsBackupInfo contactsBackupInfo, String str, String str2) {
        return TextUtils.equals(str2, contactsBackupInfo.b) && TextUtils.equals(str, contactsBackupInfo.a);
    }

    private static boolean K(Map map, Integer num) {
        if (map.get(num) != null) {
            return ((Boolean) map.get(num)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.ahou
    public final void A() {
        new ahoi().show(getSupportFragmentManager(), "DIALOG");
    }

    @Override // defpackage.ahou
    public final void B(final Map map) {
        eiig.q(this.k != null, "No device was selected when starting restore.");
        boolean K = K(map, 3);
        boolean K2 = K(map, 1);
        int F = F();
        int b = K2 ? aies.b(this.z) : 0;
        fecj v = ekjq.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekjq ekjqVar = (ekjq) fecpVar;
        ekjqVar.b |= 1;
        ekjqVar.c = F;
        if (!fecpVar.L()) {
            v.U();
        }
        ekjq ekjqVar2 = (ekjq) v.b;
        ekjqVar2.b |= 2;
        ekjqVar2.d = b;
        if (map.containsKey(3)) {
            boolean booleanValue = ((Boolean) map.get(3)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            ekjq ekjqVar3 = (ekjq) v.b;
            ekjqVar3.b |= 4;
            ekjqVar3.e = booleanValue;
        }
        if (map.containsKey(2)) {
            boolean booleanValue2 = ((Boolean) map.get(2)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            ekjq ekjqVar4 = (ekjq) v.b;
            ekjqVar4.b |= 8;
            ekjqVar4.f = booleanValue2;
        }
        if (map.containsKey(4)) {
            boolean booleanValue3 = ((Boolean) map.get(4)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            ekjq ekjqVar5 = (ekjq) v.b;
            ekjqVar5.b |= 16;
            ekjqVar5.g = booleanValue3;
        }
        if (map.containsKey(5)) {
            boolean booleanValue4 = ((Boolean) map.get(5)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            ekjq ekjqVar6 = (ekjq) v.b;
            ekjqVar6.b |= 32;
            ekjqVar6.h = booleanValue4;
        }
        ContactsBackupInfo contactsBackupInfo = this.A;
        if (contactsBackupInfo != null) {
            int i = contactsBackupInfo.d + contactsBackupInfo.e;
            if (!v.b.L()) {
                v.U();
            }
            ekjq ekjqVar7 = (ekjq) v.b;
            ekjqVar7.b |= 64;
            ekjqVar7.i = i;
        }
        ahpo ahpoVar = this.r;
        ekjq ekjqVar8 = (ekjq) v.Q();
        fecj c = ahwj.c();
        if (!c.b.L()) {
            c.U();
        }
        ekhl ekhlVar = (ekhl) c.b;
        ekhl ekhlVar2 = ekhl.a;
        ekjqVar8.getClass();
        ekhlVar.x = ekjqVar8;
        ekhlVar.b |= 4194304;
        ahpoVar.d(c, ekhk.CLOUD_RESTORE_START);
        this.E = map.size();
        if (!map.containsKey(1)) {
            this.E++;
        }
        this.D = true;
        this.F = 0;
        this.G = this.E;
        this.t = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        if (K(map, 3)) {
            if (iln.a(this, "android.permission.READ_CONTACTS") != 0) {
                hashSet.add("android.permission.READ_CONTACTS");
            }
            if (iln.a(this, "android.permission.WRITE_CONTACTS") != 0) {
                hashSet.add("android.permission.WRITE_CONTACTS");
            }
        }
        if (!hashSet.isEmpty()) {
            this.r.b(7);
            iln.h(getContainerActivity(), (String[]) hashSet.toArray(new String[0]), 0);
            return;
        }
        final boolean containsKey = map.containsKey(2);
        final boolean containsKey2 = map.containsKey(4);
        final boolean containsKey3 = map.containsKey(5);
        this.N.execute(new Runnable() { // from class: ahmu
            @Override // java.lang.Runnable
            public final void run() {
                final CloudRestoreFlowChimeraActivity cloudRestoreFlowChimeraActivity = CloudRestoreFlowChimeraActivity.this;
                Map map2 = map;
                if (containsKey) {
                    SharedPreferences.Editor edit = cloudRestoreFlowChimeraActivity.s.edit();
                    edit.putBoolean("call_history", ((Boolean) map2.get(2)).booleanValue());
                    final boolean commit = edit.commit();
                    cloudRestoreFlowChimeraActivity.runOnUiThread(new Runnable() { // from class: ahmx
                        @Override // java.lang.Runnable
                        public final void run() {
                            CloudRestoreFlowChimeraActivity.this.t(2, commit);
                        }
                    });
                }
                if (containsKey2) {
                    SharedPreferences.Editor edit2 = cloudRestoreFlowChimeraActivity.s.edit();
                    edit2.putBoolean("settings", ((Boolean) map2.get(4)).booleanValue());
                    final boolean commit2 = edit2.commit();
                    cloudRestoreFlowChimeraActivity.runOnUiThread(new Runnable() { // from class: ahmy
                        @Override // java.lang.Runnable
                        public final void run() {
                            CloudRestoreFlowChimeraActivity.this.t(4, commit2);
                        }
                    });
                }
                if (containsKey3) {
                    SharedPreferences.Editor edit3 = cloudRestoreFlowChimeraActivity.s.edit();
                    edit3.putBoolean("sms", ((Boolean) map2.get(5)).booleanValue());
                    final boolean commit3 = edit3.commit();
                    cloudRestoreFlowChimeraActivity.runOnUiThread(new Runnable() { // from class: ahmz
                        @Override // java.lang.Runnable
                        public final void run() {
                            CloudRestoreFlowChimeraActivity.this.t(5, commit3);
                        }
                    });
                }
            }
        });
        if (K) {
            HashSet hashSet2 = new HashSet();
            String[] strArr = this.A.f;
            if (strArr != null) {
                Collections.addAll(hashSet2, strArr);
            }
            String[] strArr2 = this.A.g;
            if (strArr2 != null) {
                Collections.addAll(hashSet2, strArr2);
            }
            String[] strArr3 = (String[]) hashSet2.toArray(new String[0]);
            if (this.w) {
                ahnj ahnjVar = this.v;
                Account account = this.j;
                String str = this.B;
                String str2 = this.k.e;
                ahwd ahwdVar = ahnj.a;
                ahwdVar.j("CloudRestoreContactsHelper.restoreContacts() was called.", new Object[0]);
                if (strArr3.length == 0) {
                    ahwdVar.j("No device/SIM contacts to restore", new Object[0]);
                    ahnjVar.b(true);
                } else {
                    ahnjVar.d.f(3);
                    dfaq d = ahnjVar.b.d(account.name, str, str2, strArr3);
                    d.z(new ahni(ahnjVar, 0));
                    d.y(new ahnh(ahnjVar, account.name, str, str2, strArr3, 0));
                }
            } else {
                try {
                    this.o.b(this.j, this.B, this.k.e, strArr3, new ahnp(this));
                } catch (RemoteException e) {
                    n.g("Failed to restore contacts.", e, new Object[0]);
                    this.r.c(ekjl.CONTACTS, 2);
                    t(3, false);
                }
            }
        } else {
            if (map.containsKey(3)) {
                t(3, true);
            }
            CloudRestoreChimeraService.c();
        }
        if (K2) {
            H(this.z);
        } else {
            H(Collections.EMPTY_MAP);
        }
        a(new ahoy(), true, "FRAGMENT");
    }

    @Override // defpackage.ahou
    public final void C() {
        Iterator it = this.z.keySet().iterator();
        while (it.hasNext()) {
            this.z.put((ahpk) it.next(), true);
        }
    }

    @Override // defpackage.ahou
    public final void D(Set set) {
        for (ahpk ahpkVar : this.z.keySet()) {
            this.z.put(ahpkVar, Boolean.valueOf(set.contains(ahpkVar)));
        }
    }

    public final void E() {
        if (this.q.containsValue(false)) {
            n.j("Waiting to fetch other cloud restore items: %s", this.q);
            return;
        }
        this.x = false;
        int F = F();
        String str = this.j.name;
        ahov ahovVar = new ahov();
        Bundle bundle = new Bundle();
        bundle.putString("arg_account_name", str);
        bundle.putInt("arg_num_available_apps", F);
        ahovVar.setArguments(bundle);
        a(ahovVar, true, "FRAGMENT");
    }

    @Override // defpackage.ahmo
    public final Account b() {
        String stringExtra = getIntent().getStringExtra("account");
        Account[] p = bqna.b(this).p("com.google");
        if (stringExtra != null) {
            for (Account account : p) {
                if (stringExtra.equals(account.name)) {
                    return account;
                }
            }
        }
        if (p.length > 0) {
            return p[0];
        }
        return null;
    }

    @Override // defpackage.ahmo, defpackage.ahpd
    public final void f(ahiw ahiwVar) {
        String str;
        this.k = ahiwVar;
        if (ahiwVar == null) {
            return;
        }
        this.C = this.k.c;
        G();
        String str2 = this.j.name;
        String l = Long.toString(this.k.c);
        arxo arxoVar = aief.a;
        String b = dnle.b(l);
        if (b == null) {
            str = null;
        } else {
            synchronized (aief.b) {
                String str3 = (String) aief.c.a(str2, l);
                if (str3 == null) {
                    try {
                        str3 = dnle.a(str2, b);
                    } catch (Exception e) {
                        aief.a.g(e.getMessage(), e, new Object[0]);
                    }
                    if (str3 != null) {
                        aief.c.b(str2, l, str3);
                    }
                }
                str = str3;
            }
        }
        this.B = str;
        ContactsBackupInfo contactsBackupInfo = this.A;
        if (contactsBackupInfo != null && J(contactsBackupInfo, this.j.name, this.B)) {
            v(this.A);
        } else if (this.w) {
            ahnj ahnjVar = this.v;
            String str4 = this.j.name;
            String str5 = this.B;
            ahnj.a.j("CloudRestoreContactsHelper.fetchContactsBackupInfo() was called.", new Object[0]);
            ahnjVar.d.f(2);
            dfaq e2 = ahnjVar.b.e(str4);
            Set set = ahnjVar.c;
            e2.z(new ahng(ahnjVar, str4, str5, set, 0));
            e2.y(new ahnf(ahnjVar, str4, str5, set, 0));
        } else if (this.o == null) {
            n.m("Cannot access CloudRestoreChimeraService.", new Object[0]);
            v(new ContactsBackupInfo());
        } else {
            try {
                this.u = new ahns(this);
                this.o.a(this.j.name, this.B, this.u);
            } catch (RemoteException e3) {
                n.g("Fetching contacts backup info failed.", e3, new Object[0]);
                this.A = new ContactsBackupInfo();
            }
        }
        ahnc ahncVar = new ahnc(this, ahiwVar);
        this.M = ahncVar;
        ahncVar.executeOnExecutor(this.N, new Void[0]);
        this.k = ahiwVar;
        long j = ahiwVar.c;
        ew supportFragmentManager = getSupportFragmentManager();
        int i = ahoe.al;
        this.l = (ahnw) ((ahoe) supportFragmentManager.h("APP_FETCHER_SIDECAR"));
        ahnw ahnwVar = this.l;
        if (ahnwVar == null || !ahnwVar.a.equals(Collections.singletonList(this.j)) || j != ahnwVar.b) {
            Account account = this.j;
            int i2 = ahnw.c;
            Account[] accountArr = {account};
            ahnw ahnwVar2 = new ahnw();
            Bundle bundle = new Bundle();
            bundle.putLong("android_id", j);
            bundle.putParcelableArray("accounts", accountArr);
            ahnwVar2.setArguments(bundle);
            this.l = ahnwVar2;
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.v(this.l, "APP_FETCHER_SIDECAR");
            bpVar.a();
        }
        ((ahmo) this).m = a(new ahpi(), true, "FRAGMENT");
        ahnw ahnwVar3 = this.l;
        ahnwVar3.ag = this;
        List list = ahnwVar3.ai;
        if (list != null) {
            List list2 = ahnwVar3.aj;
            l(list);
        }
    }

    @Override // defpackage.ahmo, defpackage.ahod
    public final void l(List list) {
        n.j("Apps have been fetched by the sidecar: %d apps", Integer.valueOf(list == null ? 0 : list.size()));
        this.q.put(2, true);
        this.z = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.z.put((ahpk) it.next(), true);
            }
        }
        E();
    }

    @Override // defpackage.ahou
    public final List m() {
        String quantityString;
        ahoj ahojVar;
        ArrayList arrayList = new ArrayList();
        Map map = this.z;
        if (map != null && !map.isEmpty()) {
            Map map2 = this.z;
            ahwd ahwdVar = ahoo.a;
            if (map2.isEmpty()) {
                Resources resources = getResources();
                ahojVar = new ahoj(1);
                ahojVar.b = resources.getString(R.string.d2d_app_picker_title);
                ahojVar.e = resources.getString(R.string.common_no_apps_found);
            } else {
                Resources resources2 = getResources();
                ahoj ahojVar2 = new ahoj(1);
                ahojVar2.b = resources2.getString(R.string.d2d_app_picker_title);
                ahojVar2.d();
                ahojVar2.c();
                int b = aies.b(map2);
                ahojVar2.f = b > 0;
                long j = 0;
                if (b > 0) {
                    ahwd ahwdVar2 = ahpm.a;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                j += ((ahpk) entry.getKey()).f;
                            }
                        }
                    }
                    ahojVar2.i = j;
                } else {
                    Set keySet = map2.keySet();
                    ahwd ahwdVar3 = ahpm.a;
                    if (keySet != null) {
                        Iterator it = keySet.iterator();
                        while (it.hasNext()) {
                            j += ((ahpk) it.next()).f;
                        }
                    }
                    ahojVar2.i = j;
                }
                ahojVar2.c = (b == 0 || map2.size() == b) ? resources2.getQuantityString(R.plurals.app_picker_all_apps, map2.size(), Integer.valueOf(map2.size())) : resources2.getQuantityString(R.plurals.app_picker_some_apps, b, Integer.valueOf(b));
                ahojVar2.d = getString(R.string.app_picker_no_apps);
                ahojVar = ahojVar2;
            }
            arrayList.add(ahojVar);
        }
        ContactsBackupInfo contactsBackupInfo = this.A;
        if (contactsBackupInfo != null) {
            int i = contactsBackupInfo.d;
            int i2 = contactsBackupInfo.e;
            if (i + i2 > 0) {
                ahwd ahwdVar4 = ahoo.a;
                if (i < 0) {
                    ahoo.a.m("The given number of device contacts is negative, set it to 0", new Object[0]);
                    i = 0;
                }
                if (i2 < 0) {
                    ahoo.a.m("The given number of SIM contacts is negative, set it to 0", new Object[0]);
                    i2 = 0;
                }
                ahoj ahojVar3 = new ahoj(3);
                ahojVar3.b = getString(R.string.drive_backup_content_contacts_title);
                Resources resources3 = getResources();
                if (i2 > 0 && i == 0) {
                    quantityString = resources3.getQuantityString(R.plurals.contacts_number_sim, i2, Integer.valueOf(i2));
                } else if (i2 != 0 || i <= 0) {
                    int i3 = i2 + i;
                    quantityString = resources3.getQuantityString(R.plurals.contacts_number_device_and_sim, i3, Integer.valueOf(i3));
                } else {
                    quantityString = resources3.getQuantityString(R.plurals.contacts_number_device, i, Integer.valueOf(i));
                }
                if (i == 0 && i2 == 0) {
                    ahojVar3.e = quantityString;
                } else {
                    ahojVar3.c = quantityString;
                    ahojVar3.d = getString(R.string.google_contacts_will_sync);
                    ahojVar3.f = true;
                    ahojVar3.c();
                    ahojVar3.d();
                }
                ahojVar3.i = (i + i2) * flkv.a.a().c();
                arrayList.add(ahojVar3);
            }
        }
        List list = this.p;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // defpackage.ahou
    public final Set n() {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.z.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                hashSet.add((ahpk) entry.getKey());
            }
        }
        return hashSet;
    }

    @Override // defpackage.ahou
    public final void o() {
        Iterator it = this.z.keySet().iterator();
        while (it.hasNext()) {
            this.z.put((ahpk) it.next(), false);
        }
    }

    @Override // defpackage.ahmo, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (this.D) {
            c();
        } else if (!this.x) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().as();
            this.x = false;
        }
    }

    @Override // defpackage.ahmo, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences preferences = getPreferences(0);
        this.D = preferences.getBoolean("restore_started", false);
        this.C = preferences.getLong("android_id", 0L);
        this.r = new ahpo();
        this.s = new arni(this, "cloud_restore", true);
        if (this.D) {
            n.h("Immediately finishing because restore has already started.", new Object[0]);
            p(-1);
            return;
        }
        this.N.execute(new Runnable() { // from class: ahmv
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferences.Editor edit = CloudRestoreFlowChimeraActivity.this.s.edit();
                edit.clear();
                edit.commit();
            }
        });
        G();
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.backup.component.RestoreSessionV0Service");
        intent.setAction("com.google.android.gms.backup.CLOUD_RESTORE_SERVICE_ACTION");
        asiu.a().d(this, intent, this.y, 1);
        this.I = new byhr(Looper.getMainLooper());
        if (bundle != null) {
            this.A = (ContactsBackupInfo) bundle.getParcelable("fetched_contacts_backup_info");
            long j = bundle.getLong("scheduled_finish_time_millis", -1L);
            this.K = j;
            if (j > 0) {
                I(j > SystemClock.elapsedRealtime() ? this.K - SystemClock.elapsedRealtime() : 0L);
            }
            this.t = bundle.getLong("restore_start_time_millis");
        }
        this.v = new ahnj(getApplicationContext(), this);
        this.w = flkv.a.a().j();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        Runnable runnable;
        super.onDestroy();
        AsyncTask asyncTask = this.L;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.L = null;
        }
        AsyncTask asyncTask2 = this.M;
        if (asyncTask2 != null) {
            asyncTask2.cancel(true);
            this.M = null;
        }
        if (this.o != null) {
            this.o = null;
            try {
                asiu.a().b(this, this.y);
            } catch (IllegalArgumentException | IllegalStateException e) {
                n.l(e);
            }
        }
        Handler handler = this.I;
        if (handler == null || (runnable = this.J) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    @Override // defpackage.ahmo, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        getPreferences(0).edit().putBoolean("restore_started", this.D).putLong("android_id", this.C).apply();
    }

    @Override // defpackage.ahmo, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        ContactsBackupInfo contactsBackupInfo = this.A;
        if (contactsBackupInfo != null) {
            bundle.putParcelable("fetched_contacts_backup_info", contactsBackupInfo);
        }
        long j = this.K;
        if (j > 0) {
            bundle.putLong("scheduled_finish_time_millis", j);
        }
        long j2 = this.t;
        if (j2 > 0) {
            bundle.putLong("restore_start_time_millis", j2);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void p(int i) {
        if (isDestroyed()) {
            n.h("Not finishing activity because it has already been destroyed.", new Object[0]);
            return;
        }
        if (i == -1) {
            eiig.q(this.C != 0, "No restore android id was set to pass to suw.");
            Intent intent = new Intent();
            intent.putExtra("restoreToken", this.C);
            setResult(-1, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    @Override // defpackage.ahou
    public final void q() {
        this.x = true;
        String str = this.k.e;
        Map map = this.z;
        ahnz ahnzVar = new ahnz();
        ahnzVar.b = map;
        Bundle bundle = new Bundle();
        bundle.putCharSequence("device_name", str);
        ahnzVar.setArguments(bundle);
        a(ahnzVar, true, "APP_PICKER_FRAGMENT_V2");
    }

    @Override // defpackage.ahny
    public final void r(Map map) {
        this.z = map;
        onBackPressed();
    }

    @Override // defpackage.ahny
    public final void s(Map map) {
        this.z = map;
    }

    public final void t(int i, boolean z) {
        arwm.h("onAsyncRestoreJobCompleted must run on the main thread.");
        ahwd ahwdVar = n;
        Integer valueOf = Integer.valueOf(i);
        ahwdVar.h("Async restore job for type %s is completed, it %s", valueOf, true != z ? "failed" : "succeeded");
        if (!z) {
            this.F++;
        }
        int i2 = this.G - 1;
        this.G = i2;
        if (i2 == 0) {
            ahwdVar.h("Async restore job for type %s is the last job", valueOf);
            int i3 = this.F;
            if (i3 == this.E) {
                this.r.b(4);
            } else if (i3 > 0) {
                this.r.b(3);
            } else {
                ahpo ahpoVar = this.r;
                long currentTimeMillis = System.currentTimeMillis() - this.t;
                fecj c = ahwj.c();
                fecj v = ekjg.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ekjg ekjgVar = (ekjg) fecpVar;
                ekjgVar.c = 1;
                ekjgVar.b = 1 | ekjgVar.b;
                if (!fecpVar.L()) {
                    v.U();
                }
                ekjg ekjgVar2 = (ekjg) v.b;
                ekjgVar2.b = 2 | ekjgVar2.b;
                ekjgVar2.d = currentTimeMillis;
                if (!c.b.L()) {
                    c.U();
                }
                ekhl ekhlVar = (ekhl) c.b;
                ekjg ekjgVar3 = (ekjg) v.Q();
                ekhl ekhlVar2 = ekhl.a;
                ekjgVar3.getClass();
                ekhlVar.z = ekjgVar3;
                ekhlVar.b |= 16777216;
                ahpoVar.d(c, ekhk.CLOUD_RESTORE_END);
            }
            if (!this.H) {
                ahwdVar.h("Async restore jobs finished when on restoring screen, not finishing activity.", new Object[0]);
            } else {
                ahwdVar.h("Async restore jobs finished when on waiting screen, finishing activity.", new Object[0]);
                p(-1);
            }
        }
    }

    @Override // defpackage.ahoh
    public final void u() {
        ahpo ahpoVar = this.r;
        fecj c = ahwj.c();
        fecj v = ekjp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekjp ekjpVar = (ekjp) v.b;
        ekjpVar.c = 2;
        ekjpVar.b |= 1;
        if (!c.b.L()) {
            c.U();
        }
        ekhl ekhlVar = (ekhl) c.b;
        ekjp ekjpVar2 = (ekjp) v.Q();
        ekhl ekhlVar2 = ekhl.a;
        ekjpVar2.getClass();
        ekhlVar.G = ekjpVar2;
        ekhlVar.b |= JGCastService.FLAG_USE_TDLS;
        ahpoVar.d(c, ekhk.CLOUD_RESTORE_SKIP);
        p(1);
    }

    public final void v(ContactsBackupInfo contactsBackupInfo) {
        ahwd ahwdVar = n;
        ahwdVar.j("Contacts backup information has been fetched", new Object[0]);
        this.q.put(1, true);
        if (J(contactsBackupInfo, this.j.name, this.B)) {
            this.A = contactsBackupInfo;
        } else {
            ahwdVar.m("The account name and device ID don't match the request.", new Object[0]);
            this.A = new ContactsBackupInfo();
        }
        E();
    }

    @Override // defpackage.ahox
    public final void w() {
        if (this.G <= 0) {
            n.h("'Continue with suw' pressed afer restore jobs finished, finishing activity.", new Object[0]);
            p(-1);
        } else {
            n.h("'Continue with suw' pressed before restore jobs finished, displaying waiting screen.", new Object[0]);
            this.H = true;
            a(new ahpi(), true, "FRAGMENT");
            I(flkv.a.a().a());
        }
    }

    @Override // defpackage.ahne
    public final void x(ContactsBackupInfo contactsBackupInfo) {
        v(contactsBackupInfo);
    }

    @Override // defpackage.ahne
    public final void y(boolean z) {
        z(z);
    }

    public final void z(final boolean z) {
        n.h("Restore contacts %s", true != z ? "failed" : "succeeded");
        if (z) {
            this.r.a(ekjl.CONTACTS, System.currentTimeMillis() - this.t);
        } else {
            this.r.c(ekjl.CONTACTS, 4);
        }
        runOnUiThread(new Runnable() { // from class: ahmw
            @Override // java.lang.Runnable
            public final void run() {
                CloudRestoreFlowChimeraActivity.this.t(3, z);
            }
        });
    }
}
