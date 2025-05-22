package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avtl;
import defpackage.avuc;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FenceQueryRequestImpl extends FenceQueryRequest {
    public static final Parcelable.Creator CREATOR = new avtl();
    public final QueryFenceOperation a;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class QueryFenceOperation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avuc();
        public final int a;
        public final List b;

        public QueryFenceOperation(int i, List list) {
            this.a = i;
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, this.a);
            atzr.x(parcel, 3, this.b, false);
            atzr.c(parcel, a);
        }
    }

    public FenceQueryRequestImpl(QueryFenceOperation queryFenceOperation) {
        this.a = queryFenceOperation;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.c(parcel, a);
    }

    public FenceQueryRequestImpl() {
        this(new QueryFenceOperation(1, null));
    }
}
