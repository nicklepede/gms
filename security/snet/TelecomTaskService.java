package com.google.android.gms.security.snet;

import android.content.Context;
import android.os.Build;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.bykk;
import defpackage.byln;
import defpackage.czbx;
import defpackage.czby;
import defpackage.czbz;
import defpackage.czcb;
import defpackage.czcc;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.frtq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TelecomTaskService extends GmsTaskBoundService {
    public byjl a;
    private Context b;
    private TelecomManager c;

    public TelecomTaskService() {
    }

    static synchronized void d(byjl byjlVar) {
        synchronized (TelecomTaskService.class) {
            byjlVar.d("snet_telecom_task_tag", TelecomTaskService.class.getName());
        }
    }

    static void e(byjl byjlVar) {
        if (!frtq.m() || (!frtq.k() && !frtq.j())) {
            d(byjlVar);
            return;
        }
        long i = frtq.a.a().i() * 3600;
        bykj bykjVar = new bykj();
        bykjVar.w(TelecomTaskService.class.getName());
        bykjVar.t("snet_telecom_task_tag");
        bykjVar.p = true;
        bykjVar.v(1);
        bykjVar.y(2, 2);
        bykjVar.e(i, 21600 + i);
        f(bykjVar.b(), byjlVar);
    }

    static synchronized void f(bykk bykkVar, byjl byjlVar) {
        synchronized (TelecomTaskService.class) {
            byjlVar.f(bykkVar);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (frtq.m()) {
            if (frtq.k()) {
                Map a = czbx.a(this.c);
                boolean j = frtq.j();
                Context context = this.b;
                if (!a.isEmpty()) {
                    Iterator it = a.entrySet().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i += ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                    }
                    fecj v = czcb.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    czcb czcbVar = (czcb) fecpVar;
                    czcbVar.b |= 1;
                    czcbVar.d = j;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    czcb czcbVar2 = (czcb) v.b;
                    czcbVar2.b |= 2;
                    czcbVar2.e = i;
                    List a2 = czby.a(a);
                    if (!v.b.L()) {
                        v.U();
                    }
                    czcb czcbVar3 = (czcb) v.b;
                    fedh fedhVar = czcbVar3.c;
                    if (!fedhVar.c()) {
                        czcbVar3.c = fecp.E(fedhVar);
                    }
                    feab.E(a2, czcbVar3.c);
                    czcb czcbVar4 = (czcb) v.Q();
                    fecj v2 = czcc.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    czcc czccVar = (czcc) v2.b;
                    czcbVar4.getClass();
                    czccVar.c = czcbVar4;
                    czccVar.b |= 1;
                    czby.b(context, (czcc) v2.Q());
                }
            }
            if (frtq.j()) {
                TelecomManager telecomManager = this.c;
                long h = frtq.a.a().h();
                HashMap hashMap = new HashMap();
                if (Build.VERSION.SDK_INT >= 26) {
                    Map a3 = czbx.a(telecomManager);
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
                    fecj v3 = czbz.a.v();
                    List a4 = czby.a(hashMap);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    czbz czbzVar = (czbz) v3.b;
                    fedh fedhVar2 = czbzVar.b;
                    if (!fedhVar2.c()) {
                        czbzVar.b = fecp.E(fedhVar2);
                    }
                    feab.E(a4, czbzVar.b);
                    czbz czbzVar2 = (czbz) v3.Q();
                    fecj v4 = czcc.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    czcc czccVar2 = (czcc) v4.b;
                    czbzVar2.getClass();
                    czccVar2.d = czbzVar2;
                    czccVar2.b |= 2;
                    czby.b(context2, (czcc) v4.Q());
                }
            }
        }
        e(this.a);
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        this.b = this;
        int i = czbx.a;
        int i2 = czby.a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = (TelecomManager) this.b.getSystemService(TelecomManager.class);
        }
        this.a = byjl.a(this.b);
    }

    public TelecomTaskService(Context context) {
        this.a = byjl.a(context);
    }

    TelecomTaskService(Context context, byjl byjlVar) {
        this.b = context;
        this.a = byjlVar;
    }

    TelecomTaskService(Context context, czbx czbxVar, czby czbyVar, TelecomManager telecomManager, byjl byjlVar) {
        this.b = context;
        this.c = telecomManager;
        this.a = byjlVar;
    }
}
