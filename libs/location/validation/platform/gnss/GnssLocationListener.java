package com.google.android.gms.libs.location.validation.platform.gnss;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.libs.punchclock.tracing.TracingLocationListener;
import defpackage.bzfm;
import defpackage.fxsr;
import defpackage.fxwo;
import defpackage.fxxm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GnssLocationListener extends TracingLocationListener {
    private final fxwo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnssLocationListener(Context context, fxwo fxwoVar) {
        super(context);
        fxxm.f(context, "context");
        fxxm.f(fxwoVar, "listener");
        this.a = fxwoVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    protected final void a(Location location) {
        fxxm.f(location, "location");
        fxxm.f(location, "location");
        if (bzfm.b(location)) {
            bzfm.a(location);
        } else {
            location = null;
        }
        if (location != null) {
            this.a.a(fxsr.b(location));
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    protected final void b(List list) {
        ArrayList arrayList;
        fxxm.f(list, "locations");
        fxxm.f(list, "locations");
        ArrayList<Location> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (bzfm.b((Location) obj)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(fxsr.o(arrayList2, 10));
            for (Location location : arrayList2) {
                bzfm.a(location);
                arrayList.add(location);
            }
        }
        if (arrayList != null) {
            this.a.a(arrayList);
        }
    }
}
