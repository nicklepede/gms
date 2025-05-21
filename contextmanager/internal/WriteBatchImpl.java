package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.atry;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atry();
    public ArrayList a;

    public WriteBatchImpl() {
    }

    public final boolean a() {
        ArrayList arrayList = this.a;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void b(ContextData contextData) {
        arwm.s(contextData);
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(contextData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.y(parcel, 3, this.a, false);
        arxc.c(parcel, a);
    }

    public WriteBatchImpl(ArrayList arrayList) {
        this.a = arrayList;
    }
}
