package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dfrg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ProgressEvent extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfrg();
    private static final HashMap c;
    final Set a;
    public int b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("progressType", new FastJsonResponse$Field(0, false, 0, false, "progressType", 2, null));
    }

    public ProgressEvent(Set set, int i) {
        this.a = set;
        this.b = i;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Integer.valueOf(this.b);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return c;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 2) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.b = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.o(parcel, 2, this.b);
        }
        atzr.c(parcel, a);
    }

    public ProgressEvent() {
        this.a = new HashSet();
    }

    public ProgressEvent(byte[] bArr) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = 6;
        hashSet.add(2);
    }
}
