package com.google.android.gms.ads.task;

import com.google.android.gms.ads.identifier.settings.r;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.jams.b;
import com.google.android.gms.ads.jams.d;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.cauf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class TaskChimeraService extends GmsTaskChimeraService {
    private final List a;
    private final Map b;

    public TaskChimeraService() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        b bVar = new b(new d(AppContextProvider.a()));
        r rVar = new r();
        arrayList.add(bVar);
        arrayList.add(rVar);
        hashMap.put("jams-negotiation-task", bVar);
        hashMap.put("ads.fetch_integrity_token.one_time", rVar);
        hashMap.put("ads.fetch_integrity_token.periodic", rVar);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Map map = this.b;
        String str = caufVar.a;
        if (map.containsKey(str)) {
            return ((a) map.get(str)).a(caufVar);
        }
        String concat = "Unexpected task tag: ".concat(str);
        int i = c.a;
        h.d(concat);
        return 2;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
    }
}
