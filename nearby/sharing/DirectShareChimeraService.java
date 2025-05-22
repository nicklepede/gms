package com.google.android.gms.nearby.sharing;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import com.google.android.chimera.ChooserTargetService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atzs;
import defpackage.chdw;
import defpackage.coix;
import defpackage.cojh;
import defpackage.cokk;
import defpackage.conm;
import defpackage.cpcm;
import defpackage.ctuu;
import defpackage.elgo;
import defpackage.ftdn;
import defpackage.ftga;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DirectShareChimeraService extends ChooserTargetService implements cokk, coix {
    private Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    private CountDownLatch b = new CountDownLatch(1);
    private cojh c;

    @Override // defpackage.coix
    public final void c(ShareTarget shareTarget) {
        if (this.b.getCount() == 0) {
            return;
        }
        this.a.remove(shareTarget);
    }

    @Override // defpackage.coix
    public final void jC(ShareTarget shareTarget) {
        if (this.b.getCount() == 0) {
            return;
        }
        if (shareTarget.h) {
            elgo i = elgo.i(this.a);
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                boolean q = shareTarget.q((ShareTarget) i.get(i2));
                i2++;
                if (q) {
                    conm.a.b().p("Ignore duplicated share target for direct share.", new Object[0]);
                    return;
                }
            }
        }
        this.a.add(shareTarget);
        long O = ftga.a.lK().O();
        if (this.a.size() >= O) {
            this.b.countDown();
            conm.a.b().h("Discovered required maximum %s share targets for direct share.", Long.valueOf(O));
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        conm.a.b().p("DirectShareService has been created", new Object[0]);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.b.countDown();
        super.onDestroy();
        conm.a.b().p("DirectShareService has been destroyed", new Object[0]);
    }

    @Override // com.google.android.chimera.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = new CountDownLatch(1);
        if (this.c == null) {
            this.c = chdw.e(this);
        }
        this.c.J(this, this, 2);
        ArrayList arrayList = new ArrayList();
        try {
            long P = ftga.a.lK().P();
            if (!this.b.await(P, TimeUnit.MILLISECONDS)) {
                conm.a.b().h("Discovery timed out when reporting chooser targets in %s ms.", Long.valueOf(P));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        ArrayList arrayList2 = new ArrayList(this.a);
        Collections.sort(arrayList2, new Comparator() { // from class: cnwp
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
            bundle.putByteArray("direct_share_target_bytes", atzs.n(shareTarget));
            arrayList.add(new ChooserTarget(shareTarget.b, ctuu.f(new cpcm(this, shareTarget)), 1.0f, new ComponentName(getPackageName(), true != ftdn.c() ? "com.google.android.gms.nearby.sharing.send.SendActivity" : "com.google.android.gms.nearby.sharing.main.MainActivity"), bundle));
        }
        this.c.N(this);
        conm.a.b().i("Reporting %s chooser targets in %s ms.", Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    @Override // defpackage.coix
    public final void d(ShareTarget shareTarget) {
    }

    @Override // defpackage.cokk
    public final void e(ShareTarget shareTarget, TransferMetadata transferMetadata) {
    }

    @Override // defpackage.coix
    public final void b(ShareTarget shareTarget, int i, RangingData rangingData) {
    }
}
