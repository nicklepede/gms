package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.atpi;
import defpackage.atpz;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FenceQueryRequestImpl extends FenceQueryRequest {
    public static final Parcelable.Creator CREATOR = new atpi();
    public final QueryFenceOperation a;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class QueryFenceOperation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new atpz();
        public final int a;
        public final List b;

        public QueryFenceOperation(int i, List list) {
            this.a = i;
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 2, this.a);
            arxc.x(parcel, 3, this.b, false);
            arxc.c(parcel, a);
        }
    }

    public FenceQueryRequestImpl(QueryFenceOperation queryFenceOperation) {
        this.a = queryFenceOperation;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.c(parcel, a);
    }

    public FenceQueryRequestImpl() {
        this(new QueryFenceOperation(1, null));
    }
}
