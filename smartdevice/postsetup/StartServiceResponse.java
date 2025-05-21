package com.google.android.gms.smartdevice.postsetup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dduj;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class StartServiceResponse extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dduj();
    private static final HashMap c;
    final Set a;
    public int b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("result", new FastJsonResponse$Field(0, false, 0, false, "result", 1, null));
    }

    public StartServiceResponse(Set set, int i) {
        this.a = set;
        this.b = i;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return c;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 1) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.b = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.o(parcel, 1, this.b);
        }
        arxc.c(parcel, a);
    }

    public StartServiceResponse() {
        this.a = new HashSet();
    }

    public StartServiceResponse(int i) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = i;
        hashSet.add(1);
    }
}
