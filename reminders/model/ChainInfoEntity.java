package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxee;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ChainInfoEntity extends AbstractSafeParcelable implements ChainInfo {
    public static final Parcelable.Creator CREATOR = new cxee();
    public final String a;
    public final FeatureIdProtoEntity b;

    public ChainInfoEntity(String str, FeatureIdProtoEntity featureIdProtoEntity) {
        this.a = str;
        this.b = featureIdProtoEntity;
    }

    public static int b(ChainInfo chainInfo) {
        return Arrays.hashCode(new Object[]{chainInfo.c(), chainInfo.a()});
    }

    public static boolean d(ChainInfo chainInfo, ChainInfo chainInfo2) {
        return arwb.b(chainInfo.c(), chainInfo2.c()) && arwb.b(chainInfo.a(), chainInfo2.a());
    }

    @Override // com.google.android.gms.reminders.model.ChainInfo
    public final FeatureIdProto a() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.ChainInfo
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d(this, (ChainInfo) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxee.a(this, parcel, i);
    }

    public ChainInfoEntity(ChainInfo chainInfo) {
        String c = chainInfo.c();
        FeatureIdProto a = chainInfo.a();
        this.a = c;
        this.b = a == null ? null : new FeatureIdProtoEntity(a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
