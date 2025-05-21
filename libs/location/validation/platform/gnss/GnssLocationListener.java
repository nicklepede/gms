package com.google.android.gms.libs.location.validation.platform.gnss;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.libs.punchclock.tracing.TracingLocationListener;
import defpackage.bwww;
import defpackage.fuwt;
import defpackage.fvaq;
import defpackage.fvbo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GnssLocationListener extends TracingLocationListener {
    private final fvaq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnssLocationListener(Context context, fvaq fvaqVar) {
        super(context);
        fvbo.f(context, "context");
        fvbo.f(fvaqVar, "listener");
        this.a = fvaqVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    protected final void a(Location location) {
        fvbo.f(location, "location");
        fvbo.f(location, "location");
        if (bwww.b(location)) {
            bwww.a(location);
        } else {
            location = null;
        }
        if (location != null) {
            this.a.a(fuwt.b(location));
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    protected final void b(List list) {
        ArrayList arrayList;
        fvbo.f(list, "locations");
        fvbo.f(list, "locations");
        ArrayList<Location> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (bwww.b((Location) obj)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(fuwt.o(arrayList2, 10));
            for (Location location : arrayList2) {
                bwww.a(location);
                arrayList.add(location);
            }
        }
        if (arrayList != null) {
            this.a.a(arrayList);
        }
    }
}
