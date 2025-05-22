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
import defpackage.ajjm;
import defpackage.ajne;
import defpackage.ajnq;
import defpackage.ajnr;
import defpackage.ajns;
import defpackage.ajnt;
import defpackage.ajnu;
import defpackage.ajnv;
import defpackage.ajnw;
import defpackage.ajnx;
import defpackage.ajny;
import defpackage.ajnz;
import defpackage.ajod;
import defpackage.ajof;
import defpackage.ajoi;
import defpackage.ajom;
import defpackage.ajoo;
import defpackage.ajop;
import defpackage.ajou;
import defpackage.ajox;
import defpackage.ajoy;
import defpackage.ajoz;
import defpackage.ajpe;
import defpackage.ajpk;
import defpackage.ajpl;
import defpackage.ajpn;
import defpackage.ajpo;
import defpackage.ajpy;
import defpackage.ajqa;
import defpackage.ajqc;
import defpackage.ajqe;
import defpackage.ajwt;
import defpackage.ajwz;
import defpackage.akev;
import defpackage.akfi;
import defpackage.atpx;
import defpackage.atzb;
import defpackage.auad;
import defpackage.aumo;
import defpackage.aupz;
import defpackage.bp;
import defpackage.bsup;
import defpackage.caqj;
import defpackage.dhlw;
import defpackage.dpvn;
import defpackage.ekvl;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emws;
import defpackage.emwx;
import defpackage.emxb;
import defpackage.emxc;
import defpackage.eqgo;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.focf;
import defpackage.ind;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CloudRestoreFlowChimeraActivity extends ajne implements ajpk, ajoo, ajpn, ajox, ajnu {
    public static final ajwt n = new ajwt("CloudRestoreFlow");
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
    public ajod o;
    public List p;
    public Map q;
    public ajqe r;
    public atpx s;
    public long t;
    public ajoi u;
    private ajnz v;
    private boolean w;
    private boolean x;
    private Map z;
    private final ajnt y = new ajnt(this);
    private final eqgo N = new aupz(1, 9);

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
        ajnq ajnqVar = new ajnq(this, this, map);
        this.L = ajnqVar;
        ajnqVar.executeOnExecutor(this.N, new Void[0]);
    }

    private final void I(long j) {
        ajnr ajnrVar = new ajnr(this);
        this.J = ajnrVar;
        if (j <= 0) {
            this.I.post(ajnrVar);
            this.K = SystemClock.elapsedRealtime();
        } else {
            this.I.postDelayed(ajnrVar, j);
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

    @Override // defpackage.ajpk
    public final void A() {
        new ajoy().show(getSupportFragmentManager(), "DIALOG");
    }

    @Override // defpackage.ajpk
    public final void B(final Map map) {
        ekvl.r(this.k != null, "No device was selected when starting restore.");
        boolean K = K(map, 3);
        boolean K2 = K(map, 1);
        int F = F();
        int b = K2 ? akfi.b(this.z) : 0;
        fgrc v = emxc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        emxc emxcVar = (emxc) fgriVar;
        emxcVar.b |= 1;
        emxcVar.c = F;
        if (!fgriVar.L()) {
            v.U();
        }
        emxc emxcVar2 = (emxc) v.b;
        emxcVar2.b |= 2;
        emxcVar2.d = b;
        if (map.containsKey(3)) {
            boolean booleanValue = ((Boolean) map.get(3)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            emxc emxcVar3 = (emxc) v.b;
            emxcVar3.b |= 4;
            emxcVar3.e = booleanValue;
        }
        if (map.containsKey(2)) {
            boolean booleanValue2 = ((Boolean) map.get(2)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            emxc emxcVar4 = (emxc) v.b;
            emxcVar4.b |= 8;
            emxcVar4.f = booleanValue2;
        }
        if (map.containsKey(4)) {
            boolean booleanValue3 = ((Boolean) map.get(4)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            emxc emxcVar5 = (emxc) v.b;
            emxcVar5.b |= 16;
            emxcVar5.g = booleanValue3;
        }
        if (map.containsKey(5)) {
            boolean booleanValue4 = ((Boolean) map.get(5)).booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            emxc emxcVar6 = (emxc) v.b;
            emxcVar6.b |= 32;
            emxcVar6.h = booleanValue4;
        }
        ContactsBackupInfo contactsBackupInfo = this.A;
        if (contactsBackupInfo != null) {
            int i = contactsBackupInfo.d + contactsBackupInfo.e;
            if (!v.b.L()) {
                v.U();
            }
            emxc emxcVar7 = (emxc) v.b;
            emxcVar7.b |= 64;
            emxcVar7.i = i;
        }
        ajqe ajqeVar = this.r;
        emxc emxcVar8 = (emxc) v.Q();
        fgrc c = ajwz.c();
        if (!c.b.L()) {
            c.U();
        }
        emux emuxVar = (emux) c.b;
        emux emuxVar2 = emux.a;
        emxcVar8.getClass();
        emuxVar.x = emxcVar8;
        emuxVar.b |= 4194304;
        ajqeVar.d(c, emuw.CLOUD_RESTORE_START);
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
            if (ind.a(this, "android.permission.READ_CONTACTS") != 0) {
                hashSet.add("android.permission.READ_CONTACTS");
            }
            if (ind.a(this, "android.permission.WRITE_CONTACTS") != 0) {
                hashSet.add("android.permission.WRITE_CONTACTS");
            }
        }
        if (!hashSet.isEmpty()) {
            this.r.b(7);
            ind.h(getContainerActivity(), (String[]) hashSet.toArray(new String[0]), 0);
            return;
        }
        final boolean containsKey = map.containsKey(2);
        final boolean containsKey2 = map.containsKey(4);
        final boolean containsKey3 = map.containsKey(5);
        this.N.execute(new Runnable() { // from class: ajnk
            @Override // java.lang.Runnable
            public final void run() {
                final CloudRestoreFlowChimeraActivity cloudRestoreFlowChimeraActivity = CloudRestoreFlowChimeraActivity.this;
                Map map2 = map;
                if (containsKey) {
                    SharedPreferences.Editor edit = cloudRestoreFlowChimeraActivity.s.edit();
                    edit.putBoolean("call_history", ((Boolean) map2.get(2)).booleanValue());
                    final boolean commit = edit.commit();
                    cloudRestoreFlowChimeraActivity.runOnUiThread(new Runnable() { // from class: ajnn
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
                    cloudRestoreFlowChimeraActivity.runOnUiThread(new Runnable() { // from class: ajno
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
                    cloudRestoreFlowChimeraActivity.runOnUiThread(new Runnable() { // from class: ajnp
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
                ajnz ajnzVar = this.v;
                Account account = this.j;
                String str = this.B;
                String str2 = this.k.e;
                ajwt ajwtVar = ajnz.a;
                ajwtVar.j("CloudRestoreContactsHelper.restoreContacts() was called.", new Object[0]);
                if (strArr3.length == 0) {
                    ajwtVar.j("No device/SIM contacts to restore", new Object[0]);
                    ajnzVar.b(true);
                } else {
                    ajnzVar.d.f(3);
                    dhlw d = ajnzVar.b.d(account.name, str, str2, strArr3);
                    d.z(new ajny(ajnzVar, 0));
                    d.y(new ajnx(ajnzVar, account.name, str, str2, strArr3, 0));
                }
            } else {
                try {
                    this.o.b(this.j, this.B, this.k.e, strArr3, new ajof(this));
                } catch (RemoteException e) {
                    n.g("Failed to restore contacts.", e, new Object[0]);
                    this.r.c(emwx.CONTACTS, 2);
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
        a(new ajpo(), true, "FRAGMENT");
    }

    @Override // defpackage.ajpk
    public final void C() {
        Iterator it = this.z.keySet().iterator();
        while (it.hasNext()) {
            this.z.put((ajqa) it.next(), true);
        }
    }

    @Override // defpackage.ajpk
    public final void D(Set set) {
        for (ajqa ajqaVar : this.z.keySet()) {
            this.z.put(ajqaVar, Boolean.valueOf(set.contains(ajqaVar)));
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
        ajpl ajplVar = new ajpl();
        Bundle bundle = new Bundle();
        bundle.putString("arg_account_name", str);
        bundle.putInt("arg_num_available_apps", F);
        ajplVar.setArguments(bundle);
        a(ajplVar, true, "FRAGMENT");
    }

    @Override // defpackage.ajne
    public final Account b() {
        String stringExtra = getIntent().getStringExtra("account");
        Account[] p = bsup.b(this).p("com.google");
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

    @Override // defpackage.ajne, defpackage.ajpt
    public final void f(ajjm ajjmVar) {
        String str;
        this.k = ajjmVar;
        if (ajjmVar == null) {
            return;
        }
        this.C = this.k.c;
        G();
        String str2 = this.j.name;
        String l = Long.toString(this.k.c);
        auad auadVar = akev.a;
        String b = dpvn.b(l);
        if (b == null) {
            str = null;
        } else {
            synchronized (akev.b) {
                String str3 = (String) akev.c.a(str2, l);
                if (str3 == null) {
                    try {
                        str3 = dpvn.a(str2, b);
                    } catch (Exception e) {
                        akev.a.g(e.getMessage(), e, new Object[0]);
                    }
                    if (str3 != null) {
                        akev.c.b(str2, l, str3);
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
            ajnz ajnzVar = this.v;
            String str4 = this.j.name;
            String str5 = this.B;
            ajnz.a.j("CloudRestoreContactsHelper.fetchContactsBackupInfo() was called.", new Object[0]);
            ajnzVar.d.f(2);
            dhlw e2 = ajnzVar.b.e(str4);
            Set set = ajnzVar.c;
            e2.z(new ajnw(ajnzVar, str4, str5, set, 0));
            e2.y(new ajnv(ajnzVar, str4, str5, set, 0));
        } else if (this.o == null) {
            n.m("Cannot access CloudRestoreChimeraService.", new Object[0]);
            v(new ContactsBackupInfo());
        } else {
            try {
                this.u = new ajoi(this);
                this.o.a(this.j.name, this.B, this.u);
            } catch (RemoteException e3) {
                n.g("Fetching contacts backup info failed.", e3, new Object[0]);
                this.A = new ContactsBackupInfo();
            }
        }
        ajns ajnsVar = new ajns(this, ajjmVar);
        this.M = ajnsVar;
        ajnsVar.executeOnExecutor(this.N, new Void[0]);
        this.k = ajjmVar;
        long j = ajjmVar.c;
        ew supportFragmentManager = getSupportFragmentManager();
        int i = ajou.al;
        this.l = (ajom) ((ajou) supportFragmentManager.h("APP_FETCHER_SIDECAR"));
        ajom ajomVar = this.l;
        if (ajomVar == null || !ajomVar.a.equals(Collections.singletonList(this.j)) || j != ajomVar.b) {
            Account account = this.j;
            int i2 = ajom.c;
            Account[] accountArr = {account};
            ajom ajomVar2 = new ajom();
            Bundle bundle = new Bundle();
            bundle.putLong("android_id", j);
            bundle.putParcelableArray("accounts", accountArr);
            ajomVar2.setArguments(bundle);
            this.l = ajomVar2;
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.v(this.l, "APP_FETCHER_SIDECAR");
            bpVar.a();
        }
        ((ajne) this).m = a(new ajpy(), true, "FRAGMENT");
        ajom ajomVar3 = this.l;
        ajomVar3.ag = this;
        List list = ajomVar3.ai;
        if (list != null) {
            List list2 = ajomVar3.aj;
            l(list);
        }
    }

    @Override // defpackage.ajne, defpackage.ajot
    public final void l(List list) {
        n.j("Apps have been fetched by the sidecar: %d apps", Integer.valueOf(list == null ? 0 : list.size()));
        this.q.put(2, true);
        this.z = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.z.put((ajqa) it.next(), true);
            }
        }
        E();
    }

    @Override // defpackage.ajpk
    public final List m() {
        String quantityString;
        ajoz ajozVar;
        ArrayList arrayList = new ArrayList();
        Map map = this.z;
        if (map != null && !map.isEmpty()) {
            Map map2 = this.z;
            ajwt ajwtVar = ajpe.a;
            if (map2.isEmpty()) {
                Resources resources = getResources();
                ajozVar = new ajoz(1);
                ajozVar.b = resources.getString(R.string.d2d_app_picker_title);
                ajozVar.e = resources.getString(R.string.common_no_apps_found);
            } else {
                Resources resources2 = getResources();
                ajoz ajozVar2 = new ajoz(1);
                ajozVar2.b = resources2.getString(R.string.d2d_app_picker_title);
                ajozVar2.d();
                ajozVar2.c();
                int b = akfi.b(map2);
                ajozVar2.f = b > 0;
                long j = 0;
                if (b > 0) {
                    ajwt ajwtVar2 = ajqc.a;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                j += ((ajqa) entry.getKey()).f;
                            }
                        }
                    }
                    ajozVar2.i = j;
                } else {
                    Set keySet = map2.keySet();
                    ajwt ajwtVar3 = ajqc.a;
                    if (keySet != null) {
                        Iterator it = keySet.iterator();
                        while (it.hasNext()) {
                            j += ((ajqa) it.next()).f;
                        }
                    }
                    ajozVar2.i = j;
                }
                ajozVar2.c = (b == 0 || map2.size() == b) ? resources2.getQuantityString(R.plurals.app_picker_all_apps, map2.size(), Integer.valueOf(map2.size())) : resources2.getQuantityString(R.plurals.app_picker_some_apps, b, Integer.valueOf(b));
                ajozVar2.d = getString(R.string.app_picker_no_apps);
                ajozVar = ajozVar2;
            }
            arrayList.add(ajozVar);
        }
        ContactsBackupInfo contactsBackupInfo = this.A;
        if (contactsBackupInfo != null) {
            int i = contactsBackupInfo.d;
            int i2 = contactsBackupInfo.e;
            if (i + i2 > 0) {
                ajwt ajwtVar4 = ajpe.a;
                if (i < 0) {
                    ajpe.a.m("The given number of device contacts is negative, set it to 0", new Object[0]);
                    i = 0;
                }
                if (i2 < 0) {
                    ajpe.a.m("The given number of SIM contacts is negative, set it to 0", new Object[0]);
                    i2 = 0;
                }
                ajoz ajozVar3 = new ajoz(3);
                ajozVar3.b = getString(R.string.drive_backup_content_contacts_title);
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
                    ajozVar3.e = quantityString;
                } else {
                    ajozVar3.c = quantityString;
                    ajozVar3.d = getString(R.string.google_contacts_will_sync);
                    ajozVar3.f = true;
                    ajozVar3.c();
                    ajozVar3.d();
                }
                ajozVar3.i = (i + i2) * focf.a.lK().c();
                arrayList.add(ajozVar3);
            }
        }
        List list = this.p;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // defpackage.ajpk
    public final Set n() {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.z.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                hashSet.add((ajqa) entry.getKey());
            }
        }
        return hashSet;
    }

    @Override // defpackage.ajpk
    public final void o() {
        Iterator it = this.z.keySet().iterator();
        while (it.hasNext()) {
            this.z.put((ajqa) it.next(), false);
        }
    }

    @Override // defpackage.ajne, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.ajne, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences preferences = getPreferences(0);
        this.D = preferences.getBoolean("restore_started", false);
        this.C = preferences.getLong("android_id", 0L);
        this.r = new ajqe();
        this.s = new atpx(this, "cloud_restore", true);
        if (this.D) {
            n.h("Immediately finishing because restore has already started.", new Object[0]);
            p(-1);
            return;
        }
        this.N.execute(new Runnable() { // from class: ajnl
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
        aumo.a().d(this, intent, this.y, 1);
        this.I = new caqj(Looper.getMainLooper());
        if (bundle != null) {
            this.A = (ContactsBackupInfo) bundle.getParcelable("fetched_contacts_backup_info");
            long j = bundle.getLong("scheduled_finish_time_millis", -1L);
            this.K = j;
            if (j > 0) {
                I(j > SystemClock.elapsedRealtime() ? this.K - SystemClock.elapsedRealtime() : 0L);
            }
            this.t = bundle.getLong("restore_start_time_millis");
        }
        this.v = new ajnz(getApplicationContext(), this);
        this.w = focf.a.lK().j();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
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
                aumo.a().b(this, this.y);
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

    @Override // defpackage.ajne, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        getPreferences(0).edit().putBoolean("restore_started", this.D).putLong("android_id", this.C).apply();
    }

    @Override // defpackage.ajne, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
            ekvl.r(this.C != 0, "No restore android id was set to pass to suw.");
            Intent intent = new Intent();
            intent.putExtra("restoreToken", this.C);
            setResult(-1, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    @Override // defpackage.ajpk
    public final void q() {
        this.x = true;
        String str = this.k.e;
        Map map = this.z;
        ajop ajopVar = new ajop();
        ajopVar.b = map;
        Bundle bundle = new Bundle();
        bundle.putCharSequence("device_name", str);
        ajopVar.setArguments(bundle);
        a(ajopVar, true, "APP_PICKER_FRAGMENT_V2");
    }

    @Override // defpackage.ajoo
    public final void r(Map map) {
        this.z = map;
        onBackPressed();
    }

    @Override // defpackage.ajoo
    public final void s(Map map) {
        this.z = map;
    }

    public final void t(int i, boolean z) {
        atzb.h("onAsyncRestoreJobCompleted must run on the main thread.");
        ajwt ajwtVar = n;
        Integer valueOf = Integer.valueOf(i);
        ajwtVar.h("Async restore job for type %s is completed, it %s", valueOf, true != z ? "failed" : "succeeded");
        if (!z) {
            this.F++;
        }
        int i2 = this.G - 1;
        this.G = i2;
        if (i2 == 0) {
            ajwtVar.h("Async restore job for type %s is the last job", valueOf);
            int i3 = this.F;
            if (i3 == this.E) {
                this.r.b(4);
            } else if (i3 > 0) {
                this.r.b(3);
            } else {
                ajqe ajqeVar = this.r;
                long currentTimeMillis = System.currentTimeMillis() - this.t;
                fgrc c = ajwz.c();
                fgrc v = emws.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                emws emwsVar = (emws) fgriVar;
                emwsVar.c = 1;
                emwsVar.b = 1 | emwsVar.b;
                if (!fgriVar.L()) {
                    v.U();
                }
                emws emwsVar2 = (emws) v.b;
                emwsVar2.b = 2 | emwsVar2.b;
                emwsVar2.d = currentTimeMillis;
                if (!c.b.L()) {
                    c.U();
                }
                emux emuxVar = (emux) c.b;
                emws emwsVar3 = (emws) v.Q();
                emux emuxVar2 = emux.a;
                emwsVar3.getClass();
                emuxVar.z = emwsVar3;
                emuxVar.b |= 16777216;
                ajqeVar.d(c, emuw.CLOUD_RESTORE_END);
            }
            if (!this.H) {
                ajwtVar.h("Async restore jobs finished when on restoring screen, not finishing activity.", new Object[0]);
            } else {
                ajwtVar.h("Async restore jobs finished when on waiting screen, finishing activity.", new Object[0]);
                p(-1);
            }
        }
    }

    @Override // defpackage.ajox
    public final void u() {
        ajqe ajqeVar = this.r;
        fgrc c = ajwz.c();
        fgrc v = emxb.a.v();
        if (!v.b.L()) {
            v.U();
        }
        emxb emxbVar = (emxb) v.b;
        emxbVar.c = 2;
        emxbVar.b |= 1;
        if (!c.b.L()) {
            c.U();
        }
        emux emuxVar = (emux) c.b;
        emxb emxbVar2 = (emxb) v.Q();
        emux emuxVar2 = emux.a;
        emxbVar2.getClass();
        emuxVar.G = emxbVar2;
        emuxVar.b |= JGCastService.FLAG_USE_TDLS;
        ajqeVar.d(c, emuw.CLOUD_RESTORE_SKIP);
        p(1);
    }

    public final void v(ContactsBackupInfo contactsBackupInfo) {
        ajwt ajwtVar = n;
        ajwtVar.j("Contacts backup information has been fetched", new Object[0]);
        this.q.put(1, true);
        if (J(contactsBackupInfo, this.j.name, this.B)) {
            this.A = contactsBackupInfo;
        } else {
            ajwtVar.m("The account name and device ID don't match the request.", new Object[0]);
            this.A = new ContactsBackupInfo();
        }
        E();
    }

    @Override // defpackage.ajpn
    public final void w() {
        if (this.G <= 0) {
            n.h("'Continue with suw' pressed afer restore jobs finished, finishing activity.", new Object[0]);
            p(-1);
        } else {
            n.h("'Continue with suw' pressed before restore jobs finished, displaying waiting screen.", new Object[0]);
            this.H = true;
            a(new ajpy(), true, "FRAGMENT");
            I(focf.a.lK().a());
        }
    }

    @Override // defpackage.ajnu
    public final void x(ContactsBackupInfo contactsBackupInfo) {
        v(contactsBackupInfo);
    }

    @Override // defpackage.ajnu
    public final void y(boolean z) {
        z(z);
    }

    public final void z(final boolean z) {
        n.h("Restore contacts %s", true != z ? "failed" : "succeeded");
        if (z) {
            this.r.a(emwx.CONTACTS, System.currentTimeMillis() - this.t);
        } else {
            this.r.c(emwx.CONTACTS, 4);
        }
        runOnUiThread(new Runnable() { // from class: ajnm
            @Override // java.lang.Runnable
            public final void run() {
                CloudRestoreFlowChimeraActivity.this.t(3, z);
            }
        });
    }
}
