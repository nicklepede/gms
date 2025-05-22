package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.avwb;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avwb();
    public ArrayList a;

    public WriteBatchImpl() {
    }

    public final boolean a() {
        ArrayList arrayList = this.a;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void b(ContextData contextData) {
        atzb.s(contextData);
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(contextData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.y(parcel, 3, this.a, false);
        atzr.c(parcel, a);
    }

    public WriteBatchImpl(ArrayList arrayList) {
        this.a = arrayList;
    }
}
