package com.google.android.gms.security.snet;

import android.content.Context;
import android.os.Build;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.catb;
import defpackage.catc;
import defpackage.cauf;
import defpackage.dblv;
import defpackage.dblw;
import defpackage.dblx;
import defpackage.dblz;
import defpackage.dbma;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fuoj;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TelecomTaskService extends GmsTaskBoundService {
    public casd a;
    private Context b;
    private TelecomManager c;

    public TelecomTaskService() {
    }

    static synchronized void d(casd casdVar) {
        synchronized (TelecomTaskService.class) {
            casdVar.d("snet_telecom_task_tag", TelecomTaskService.class.getName());
        }
    }

    static void e(casd casdVar) {
        if (!fuoj.m() || (!fuoj.k() && !fuoj.j())) {
            d(casdVar);
            return;
        }
        long i = fuoj.a.lK().i() * 3600;
        catb catbVar = new catb();
        catbVar.w(TelecomTaskService.class.getName());
        catbVar.t("snet_telecom_task_tag");
        catbVar.p = true;
        catbVar.v(1);
        catbVar.y(2, 2);
        catbVar.e(i, 21600 + i);
        f(catbVar.b(), casdVar);
    }

    static synchronized void f(catc catcVar, casd casdVar) {
        synchronized (TelecomTaskService.class) {
            casdVar.f(catcVar);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (fuoj.m()) {
            if (fuoj.k()) {
                Map a = dblv.a(this.c);
                boolean j = fuoj.j();
                Context context = this.b;
                if (!a.isEmpty()) {
                    Iterator it = a.entrySet().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i += ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                    }
                    fgrc v = dblz.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    dblz dblzVar = (dblz) fgriVar;
                    dblzVar.b |= 1;
                    dblzVar.d = j;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    dblz dblzVar2 = (dblz) v.b;
                    dblzVar2.b |= 2;
                    dblzVar2.e = i;
                    List a2 = dblw.a(a);
                    if (!v.b.L()) {
                        v.U();
                    }
                    dblz dblzVar3 = (dblz) v.b;
                    fgsa fgsaVar = dblzVar3.c;
                    if (!fgsaVar.c()) {
                        dblzVar3.c = fgri.E(fgsaVar);
                    }
                    fgou.E(a2, dblzVar3.c);
                    dblz dblzVar4 = (dblz) v.Q();
                    fgrc v2 = dbma.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    dbma dbmaVar = (dbma) v2.b;
                    dblzVar4.getClass();
                    dbmaVar.c = dblzVar4;
                    dbmaVar.b |= 1;
                    dblw.b(context, (dbma) v2.Q());
                }
            }
            if (fuoj.j()) {
                TelecomManager telecomManager = this.c;
                long h = fuoj.a.lK().h();
                HashMap hashMap = new HashMap();
                if (Build.VERSION.SDK_INT >= 26) {
                    Map a3 = dblv.a(telecomManager);
                    HashSet hashSet = new HashSet();
                    for (String str : a3.keySet()) {
                        Integer num = (Integer) a3.get(str);
                        if (num.intValue() > h) {
                            hashMap.put(str, num);
                            hashSet.add(str);
                        }
                    }
                    List<PhoneAccountHandle> allPhoneAccountHandles = telecomManager.getAllPhoneAccountHandles();
                    if (allPhoneAccountHandles != null) {
                        for (PhoneAccountHandle phoneAccountHandle : allPhoneAccountHandles) {
                            if (hashSet.contains(phoneAccountHandle.getComponentName().getPackageName())) {
                                telecomManager.unregisterPhoneAccount(phoneAccountHandle);
                            }
                        }
                    }
                }
                Context context2 = this.b;
                if (!hashMap.isEmpty()) {
                    fgrc v3 = dblx.a.v();
                    List a4 = dblw.a(hashMap);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    dblx dblxVar = (dblx) v3.b;
                    fgsa fgsaVar2 = dblxVar.b;
                    if (!fgsaVar2.c()) {
                        dblxVar.b = fgri.E(fgsaVar2);
                    }
                    fgou.E(a4, dblxVar.b);
                    dblx dblxVar2 = (dblx) v3.Q();
                    fgrc v4 = dbma.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    dbma dbmaVar2 = (dbma) v4.b;
                    dblxVar2.getClass();
                    dbmaVar2.d = dblxVar2;
                    dbmaVar2.b |= 2;
                    dblw.b(context2, (dbma) v4.Q());
                }
            }
        }
        e(this.a);
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        this.b = this;
        int i = dblv.a;
        int i2 = dblw.a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = (TelecomManager) this.b.getSystemService(TelecomManager.class);
        }
        this.a = casd.a(this.b);
    }

    public TelecomTaskService(Context context) {
        this.a = casd.a(context);
    }

    TelecomTaskService(Context context, casd casdVar) {
        this.b = context;
        this.a = casdVar;
    }

    TelecomTaskService(Context context, dblv dblvVar, dblw dblwVar, TelecomManager telecomManager, casd casdVar) {
        this.b = context;
        this.c = telecomManager;
        this.a = casdVar;
    }
}
