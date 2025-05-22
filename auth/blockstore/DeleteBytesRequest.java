package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abyq;
import defpackage.atzb;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeleteBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abyq();
    public final boolean a;
    private final List b;

    public DeleteBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            atzb.m(z2, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.a = z;
        this.b = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                atzb.r(str, "Element in keys cannot be null or empty");
                this.b.add(str);
            }
        }
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.x(parcel, 1, a(), false);
        atzr.e(parcel, 2, this.a);
        atzr.c(parcel, a);
    }
}
