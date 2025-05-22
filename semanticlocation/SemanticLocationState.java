package com.google.android.gms.semanticlocation;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dbqz;
import defpackage.elgo;
import defpackage.elpg;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationState extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final List a;
    public final List b;
    public final long c;
    public final DebugData d;

    static {
        int i = elgo.d;
        a = elpg.a;
        CREATOR = new dbqz();
    }

    public SemanticLocationState(List list, long j, DebugData debugData) {
        this.b = list;
        this.c = j;
        this.d = debugData;
    }

    public static SemanticLocationState a(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.gms.semanticlocation.EXTRA_SEMANTIC_LOCATION_STATE")) {
            return (SemanticLocationState) intent.getParcelableExtra("com.google.android.gms.semanticlocation.EXTRA_SEMANTIC_LOCATION_STATE");
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticLocationState)) {
            return false;
        }
        SemanticLocationState semanticLocationState = (SemanticLocationState) obj;
        return atyq.b(this.b, semanticLocationState.b) && atyq.b(Long.valueOf(this.c), Long.valueOf(semanticLocationState.c)) && atyq.b(this.d, semanticLocationState.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.q(parcel, 2, this.c);
        atzr.t(parcel, 3, this.d, i, false);
        atzr.c(parcel, a2);
    }
}
