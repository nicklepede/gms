package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.DeviceAccountId;
import com.google.android.gms.nearby.sharing.GcmChimeraBroadcastReceiver;
import com.google.android.gms.nearby.sharing.internal.GetDeviceAccountIdParams;
import com.google.android.gms.nearby.sharing.internal.InvalidateIntentParams;
import com.google.android.gms.nearby.sharing.internal.SyncParams;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.auur;
import defpackage.chdv;
import defpackage.chdw;
import defpackage.chet;
import defpackage.cojh;
import defpackage.conm;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.emdw;
import defpackage.emev;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private cojh b = null;

    public static String a(String str) {
        int i = emdw.b;
        return emev.a.d(str).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            conm.a.e().p("GcmChimeraBroadcastReceiver Intent is expected but found null", new Object[0]);
            return;
        }
        final String c = auur.c(intent.getStringExtra("deviceid"));
        final String c2 = auur.c(intent.getStringExtra("accountid"));
        chet chetVar = conm.a;
        chetVar.a().i("GcmChimeraBroadcastReceiver intent: deviceIdHash = %s, accountNameHash = %s", c, c2);
        final String stringExtra = intent.getStringExtra("debug");
        chetVar.a().h("GcmChimeraBroadcastReceiver intent: debug = %s", stringExtra);
        if (c.isEmpty() || c2.isEmpty()) {
            chetVar.e().i("GcmChimeraBroadcastReceiver Intent does not contain deviceIdHash = %s or accountNameHash = %s", c, c2);
            return;
        }
        if (this.b == null) {
            this.b = chdw.e(context);
        }
        final cojh cojhVar = this.b;
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: cpgj
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = cpil.a;
                cpfd cpfdVar = (cpfd) ((cpkf) obj).H();
                GetDeviceAccountIdParams getDeviceAccountIdParams = new GetDeviceAccountIdParams();
                getDeviceAccountIdParams.a = new cpem((dhma) obj2);
                cpfdVar.k(getDeviceAccountIdParams);
            }
        };
        atfnVar.c = new Feature[]{chdv.a};
        atfnVar.d = 1352;
        dhlw jd = ((atad) cojhVar).jd(atfnVar.a());
        jd.z(new dhlq() { // from class: cnwu
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                String str;
                final DeviceAccountId deviceAccountId = (DeviceAccountId) obj;
                if (ftgf.a.lK().aK()) {
                    String str2 = deviceAccountId.b;
                    int indexOf = str2.indexOf(64);
                    if (indexOf < 0 || str2.endsWith("@")) {
                        str = str2.replace("\t", "").trim();
                    } else {
                        String substring = str2.substring(0, indexOf);
                        String substring2 = str2.substring(indexOf + 1);
                        int indexOf2 = substring.indexOf(43);
                        if (indexOf2 >= 0) {
                            substring = substring.substring(0, indexOf2);
                        }
                        str = ekti.c(substring.replace(".", "").replace("\t", "").replace("\r", "").replace("\n", "").replace("*", "") + "@" + substring2).trim();
                    }
                } else {
                    str = deviceAccountId.b;
                }
                final String str3 = c2;
                String a = GcmChimeraBroadcastReceiver.a(str);
                if (!str3.equals(a)) {
                    conm.a.a().j("GcmChimeraBroadcastReceiver sync skipped not the same user: (%s, %s, %s)", str3, a, deviceAccountId.b);
                    return;
                }
                final String str4 = c;
                String str5 = deviceAccountId.a;
                String a2 = GcmChimeraBroadcastReceiver.a(str5);
                if (str4.equals(a2)) {
                    conm.a.a().j("GcmChimeraBroadcastReceiver sync skipped triggered by the same device: (%s, %s, %s)", str4, a2, str5);
                    return;
                }
                atai ataiVar = cojhVar;
                if (!ftgf.aa()) {
                    final Intent putExtra = new Intent().putExtra("com.google.android.gms.sharing.CHIME_NOTIFICATION_TRIGGER_SYNC", true);
                    atfn atfnVar2 = new atfn();
                    atfnVar2.a = new atfd() { // from class: cpgz
                        @Override // defpackage.atfd
                        public final void d(Object obj2, Object obj3) {
                            int i = cpil.a;
                            cpfd cpfdVar = (cpfd) ((cpkf) obj2).H();
                            InvalidateIntentParams invalidateIntentParams = new InvalidateIntentParams();
                            invalidateIntentParams.a = putExtra;
                            invalidateIntentParams.b = new cpez((dhma) obj3);
                            cpfdVar.y(invalidateIntentParams);
                        }
                    };
                    atfnVar2.c = new Feature[]{chdv.R};
                    atfnVar2.d = 1311;
                    ((atad) ataiVar).ji(atfnVar2.a()).x(new dhlk() { // from class: cnww
                        @Override // defpackage.dhlk
                        public final void hH(dhlw dhlwVar) {
                        }
                    });
                }
                final String str6 = stringExtra;
                atfn atfnVar3 = new atfn();
                atfnVar3.a = new atfd() { // from class: cphg
                    @Override // defpackage.atfd
                    public final void d(Object obj2, Object obj3) {
                        int i = cpil.a;
                        cpfd cpfdVar = (cpfd) ((cpkf) obj2).H();
                        SyncParams syncParams = new SyncParams();
                        syncParams.a = new cpic((dhma) obj3);
                        syncParams.b = 2;
                        cpfdVar.aa(syncParams);
                    }
                };
                atfnVar3.c = new Feature[]{chdv.T};
                atfnVar3.d = 1312;
                dhlw ji = ((atad) ataiVar).ji(atfnVar3.a());
                ji.z(new dhlq() { // from class: cnwx
                    @Override // defpackage.dhlq
                    public final void gC(Object obj2) {
                        chet a3 = conm.a.a();
                        String str7 = str4;
                        String str8 = str3;
                        String str9 = str6;
                        DeviceAccountId deviceAccountId2 = deviceAccountId;
                        a3.l("GcmChimeraBroadcastReceiver SharingClient.sync() succeeded: source(%s, %s, %s), target(%s, %s)", str7, str8, str9, deviceAccountId2.a, deviceAccountId2.b);
                    }
                });
                ji.y(new dhln() { // from class: cnwy
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        chet f = conm.a.c().f(exc);
                        String str7 = str4;
                        String str8 = str3;
                        String str9 = str6;
                        DeviceAccountId deviceAccountId2 = deviceAccountId;
                        f.l("GcmChimeraBroadcastReceiver SharingClient.sync() failed: source(%s, %s, %s), target(%s, %s)", str7, str8, str9, deviceAccountId2.a, deviceAccountId2.b);
                    }
                });
            }
        });
        jd.y(new dhln() { // from class: cnwv
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                conm.a.c().f(exc).p("GcmChimeraBroadcastReceiver SharingClient.getDeviceAccountId() failed", new Object[0]);
            }
        });
    }
}
