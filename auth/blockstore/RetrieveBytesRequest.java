package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zzd;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zzd();
    public final boolean a;
    private final List b;

    public RetrieveBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            arwm.m(z2, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.a = z;
        this.b = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                arwm.r(str, "Element in keys cannot be null or empty");
                this.b.add(str);
            }
        }
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, a(), false);
        arxc.e(parcel, 2, this.a);
        arxc.c(parcel, a);
    }
}
