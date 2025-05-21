package com.google.android.gms.nearby.sharing;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import com.google.android.chimera.ChooserTargetService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arxd;
import defpackage.cewl;
import defpackage.cmap;
import defpackage.cmaz;
import defpackage.cmcc;
import defpackage.cmfe;
import defpackage.cmue;
import defpackage.crlp;
import defpackage.eitj;
import defpackage.fqjv;
import defpackage.fqmf;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DirectShareChimeraService extends ChooserTargetService implements cmcc, cmap {
    private Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    private CountDownLatch b = new CountDownLatch(1);
    private cmaz c;

    @Override // defpackage.cmap
    public final void c(ShareTarget shareTarget) {
        if (this.b.getCount() == 0) {
            return;
        }
        this.a.remove(shareTarget);
    }

    @Override // defpackage.cmap
    public final void jn(ShareTarget shareTarget) {
        if (this.b.getCount() == 0) {
            return;
        }
        if (shareTarget.h) {
            eitj i = eitj.i(this.a);
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                boolean q = shareTarget.q((ShareTarget) i.get(i2));
                i2++;
                if (q) {
                    cmfe.a.b().p("Ignore duplicated share target for direct share.", new Object[0]);
                    return;
                }
            }
        }
        this.a.add(shareTarget);
        long L = fqmf.a.a().L();
        if (this.a.size() >= L) {
            this.b.countDown();
            cmfe.a.b().h("Discovered required maximum %s share targets for direct share.", Long.valueOf(L));
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        cmfe.a.b().p("DirectShareService has been created", new Object[0]);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.b.countDown();
        super.onDestroy();
        cmfe.a.b().p("DirectShareService has been destroyed", new Object[0]);
    }

    @Override // com.google.android.chimera.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = new CountDownLatch(1);
        if (this.c == null) {
            this.c = cewl.e(this);
        }
        this.c.J(this, this, 2);
        ArrayList arrayList = new ArrayList();
        try {
            long M = fqmf.a.a().M();
            if (!this.b.await(M, TimeUnit.MILLISECONDS)) {
                cmfe.a.b().h("Discovery timed out when reporting chooser targets in %s ms.", Long.valueOf(M));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        ArrayList arrayList2 = new ArrayList(this.a);
        Collections.sort(arrayList2, new Comparator() { // from class: cloh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ShareTarget shareTarget = (ShareTarget) obj;
                ShareTarget shareTarget2 = (ShareTarget) obj2;
                if (shareTarget.h) {
                    if (!shareTarget2.h) {
                        return -1;
                    }
                } else if (shareTarget2.h) {
                    return 1;
                }
                return shareTarget.b.compareTo(shareTarget2.b);
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ShareTarget shareTarget = (ShareTarget) arrayList2.get(i);
            Bundle bundle = new Bundle();
            bundle.putByteArray("direct_share_target_bytes", arxd.n(shareTarget));
            arrayList.add(new ChooserTarget(shareTarget.b, crlp.f(new cmue(this, shareTarget)), 1.0f, new ComponentName(getPackageName(), true != fqjv.c() ? "com.google.android.gms.nearby.sharing.send.SendActivity" : "com.google.android.gms.nearby.sharing.main.MainActivity"), bundle));
        }
        this.c.N(this);
        cmfe.a.b().i("Reporting %s chooser targets in %s ms.", Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    @Override // defpackage.cmap
    public final void d(ShareTarget shareTarget) {
    }

    @Override // defpackage.cmcc
    public final void e(ShareTarget shareTarget, TransferMetadata transferMetadata) {
    }

    @Override // defpackage.cmap
    public final void b(ShareTarget shareTarget, int i, RangingData rangingData) {
    }
}
