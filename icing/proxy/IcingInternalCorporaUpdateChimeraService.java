package com.google.android.gms.icing.proxy;

import android.provider.ContactsContract;
import com.google.android.gms.chimera.modules.icing.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auub;
import defpackage.bnxz;
import defpackage.bnyn;
import defpackage.carn;
import defpackage.caro;
import defpackage.casd;
import defpackage.frtk;
import defpackage.frtz;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IcingInternalCorporaUpdateChimeraService extends GmsTaskChimeraService {
    static final carn a;
    public static final /* synthetic */ int b = 0;

    static {
        a = auub.a() ? new carn(ContactsContract.AUTHORITY_URI, 1) : null;
    }

    public static void d() {
        carn carnVar;
        bnyn.k("Calling IcingInternalCorporaUpdateChimeraService.schedule");
        if (!auub.a()) {
            bnyn.k("Not schedule ContenUriTriggeredTask because of platform version is lower than N.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (frtk.a.lK().N() && frtz.d() >= 0 && bnxz.e() && (carnVar = a) != null) {
            bnyn.k("Contacts Corpus is enabled. Adding its uri trigger to list");
            arrayList.add(carnVar);
        }
        if (arrayList.isEmpty()) {
            bnyn.k("Not schedule ContentUriTriggeredTask because the uri trigger list is empty.");
            return;
        }
        bnyn.k("Scheduling ContentUriTriggeredTask");
        casd a2 = casd.a(AppContextProvider.a());
        caro caroVar = new caro();
        caroVar.t("internal-corpora-update");
        caroVar.j = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
        caroVar.v(1);
        caroVar.d(arrayList);
        caroVar.r(false);
        a2.f(caroVar.b());
        bnyn.k("ContentUriTriggeredTask is scheduled");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:9:0x0010, B:11:0x0019, B:13:0x0020, B:15:0x0026, B:18:0x002c, B:19:0x003e, B:21:0x0044, B:24:0x004c, B:26:0x0052, B:40:0x0058, B:31:0x005f, B:46:0x0069, B:51:0x00a7, B:52:0x00ba, B:54:0x00cc, B:73:0x00b6, B:72:0x00b3, B:75:0x00e3, B:76:0x00ed, B:86:0x00f9, B:87:0x00fa, B:67:0x00ad, B:78:0x00ee, B:80:0x00f2, B:81:0x00f5, B:56:0x008a, B:59:0x0091, B:61:0x009b, B:62:0x00a3), top: B:8:0x0010, inners: #0, #2, #3 }] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateChimeraService.a(cauf):int");
    }
}
