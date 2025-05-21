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
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asqx;
import defpackage.cewk;
import defpackage.cewl;
import defpackage.cexi;
import defpackage.cmaz;
import defpackage.cmfe;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.ejqn;
import defpackage.ejrm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private cmaz b = null;

    public static String a(String str) {
        int i = ejqn.b;
        return ejrm.a.d(str).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            cmfe.a.e().p("GcmChimeraBroadcastReceiver Intent is expected but found null", new Object[0]);
            return;
        }
        final String c = asqx.c(intent.getStringExtra("deviceid"));
        final String c2 = asqx.c(intent.getStringExtra("accountid"));
        cmfe.a.a().i("GcmChimeraBroadcastReceiver intent: deviceIdHash = %s, accountNameHash = %s", c, c2);
        final String stringExtra = intent.getStringExtra("debug");
        cexi cexiVar = cmfe.a;
        cexiVar.a().h("GcmChimeraBroadcastReceiver intent: debug = %s", stringExtra);
        if (c.isEmpty() || c2.isEmpty()) {
            cexiVar.e().i("GcmChimeraBroadcastReceiver Intent does not contain deviceIdHash = %s or accountNameHash = %s", c, c2);
            return;
        }
        if (this.b == null) {
            this.b = cewl.e(context);
        }
        final cmaz cmazVar = this.b;
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: cmyb
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = cnad.a;
                cmwv cmwvVar = (cmwv) ((cnbx) obj).H();
                GetDeviceAccountIdParams getDeviceAccountIdParams = new GetDeviceAccountIdParams();
                getDeviceAccountIdParams.a = new cmwe((dfau) obj2);
                cmwvVar.k(getDeviceAccountIdParams);
            }
        };
        arcyVar.c = new Feature[]{cewk.a};
        arcyVar.d = 1352;
        dfaq iO = ((aqxo) cmazVar).iO(arcyVar.a());
        iO.z(new dfak() { // from class: clom
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                String str;
                final DeviceAccountId deviceAccountId = (DeviceAccountId) obj;
                if (fqmk.a.a().aO()) {
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
                        str = eigd.c(substring.replace(".", "").replace("\t", "").replace("\r", "").replace("\n", "").replace("*", "") + "@" + substring2).trim();
                    }
                } else {
                    str = deviceAccountId.b;
                }
                final String str3 = c2;
                String a = GcmChimeraBroadcastReceiver.a(str);
                if (!str3.equals(a)) {
                    cmfe.a.a().j("GcmChimeraBroadcastReceiver sync skipped not the same user: (%s, %s, %s)", str3, a, deviceAccountId.b);
                    return;
                }
                final String str4 = c;
                String str5 = deviceAccountId.a;
                String a2 = GcmChimeraBroadcastReceiver.a(str5);
                if (str4.equals(a2)) {
                    cmfe.a.a().j("GcmChimeraBroadcastReceiver sync skipped triggered by the same device: (%s, %s, %s)", str4, a2, str5);
                    return;
                }
                aqxt aqxtVar = cmazVar;
                if (!fqmk.aa()) {
                    final Intent putExtra = new Intent().putExtra("com.google.android.gms.sharing.CHIME_NOTIFICATION_TRIGGER_SYNC", true);
                    arcy arcyVar2 = new arcy();
                    arcyVar2.a = new arco() { // from class: cmyr
                        @Override // defpackage.arco
                        public final void d(Object obj2, Object obj3) {
                            int i = cnad.a;
                            cmwv cmwvVar = (cmwv) ((cnbx) obj2).H();
                            InvalidateIntentParams invalidateIntentParams = new InvalidateIntentParams();
                            invalidateIntentParams.a = putExtra;
                            invalidateIntentParams.b = new cmwr((dfau) obj3);
                            cmwvVar.y(invalidateIntentParams);
                        }
                    };
                    arcyVar2.c = new Feature[]{cewk.R};
                    arcyVar2.d = 1311;
                    ((aqxo) aqxtVar).iT(arcyVar2.a()).x(new dfae() { // from class: cloo
                        @Override // defpackage.dfae
                        public final void hr(dfaq dfaqVar) {
                        }
                    });
                }
                final String str6 = stringExtra;
                arcy arcyVar3 = new arcy();
                arcyVar3.a = new arco() { // from class: cmyy
                    @Override // defpackage.arco
                    public final void d(Object obj2, Object obj3) {
                        int i = cnad.a;
                        cmwv cmwvVar = (cmwv) ((cnbx) obj2).H();
                        SyncParams syncParams = new SyncParams();
                        syncParams.a = new cmzu((dfau) obj3);
                        syncParams.b = 2;
                        cmwvVar.aa(syncParams);
                    }
                };
                arcyVar3.c = new Feature[]{cewk.T};
                arcyVar3.d = 1312;
                dfaq iT = ((aqxo) aqxtVar).iT(arcyVar3.a());
                iT.z(new dfak() { // from class: clop
                    @Override // defpackage.dfak
                    public final void gn(Object obj2) {
                        cexi a3 = cmfe.a.a();
                        String str7 = str4;
                        String str8 = str3;
                        String str9 = str6;
                        DeviceAccountId deviceAccountId2 = deviceAccountId;
                        a3.l("GcmChimeraBroadcastReceiver SharingClient.sync() succeeded: source(%s, %s, %s), target(%s, %s)", str7, str8, str9, deviceAccountId2.a, deviceAccountId2.b);
                    }
                });
                iT.y(new dfah() { // from class: cloq
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        cexi f = cmfe.a.c().f(exc);
                        String str7 = str4;
                        String str8 = str3;
                        String str9 = str6;
                        DeviceAccountId deviceAccountId2 = deviceAccountId;
                        f.l("GcmChimeraBroadcastReceiver SharingClient.sync() failed: source(%s, %s, %s), target(%s, %s)", str7, str8, str9, deviceAccountId2.a, deviceAccountId2.b);
                    }
                });
            }
        });
        iO.y(new dfah() { // from class: clon
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                cmfe.a.c().f(exc).p("GcmChimeraBroadcastReceiver SharingClient.getDeviceAccountId() failed", new Object[0]);
            }
        });
    }
}
