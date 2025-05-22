package com.google.android.gms.fido.fido2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdvf;
import defpackage.bdvg;
import defpackage.bdvh;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdvh();

    @Deprecated
    public static final StateUpdate a = new StateUpdate(Type.CANCEL);
    public static final StateUpdate b = new StateUpdate(Type.PAUSE);
    public static final StateUpdate c = new StateUpdate(Type.RESUME);
    public static final StateUpdate d = new StateUpdate(Type.STOP);
    public final String e;
    private final Type f;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public enum Type implements Parcelable {
        CANCEL("cancel"),
        PAUSE("pause"),
        RESUME("resume"),
        STOP("stop"),
        DEVICE_SELECTION("user_selected_device"),
        SELECT_VIEW("user_selected_view"),
        SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
        UPDATE_CURRENT_VIEW("update_current_view");

        public static final Parcelable.Creator CREATOR = new bdvf();
        public final String i;

        Type(String str) {
            this.i = str;
        }

        public static Type a(String str) {
            for (Type type : values()) {
                if (str.equals(type.i)) {
                    return type;
                }
            }
            throw new bdvg(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.i);
        }
    }

    public StateUpdate(Type type) {
        this(type, (JSONObject) null);
    }

    public final String a() {
        Type type = Type.CANCEL;
        return this.f.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StateUpdate)) {
            return false;
        }
        StateUpdate stateUpdate = (StateUpdate) obj;
        return atyq.b(this.f, stateUpdate.f) && atyq.b(this.e, stateUpdate.e);
    }

    public final int hashCode() {
        Type type = Type.CANCEL;
        return Arrays.hashCode(new Object[]{this.f.i, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 2, a(), false);
        atzr.v(parcel, 3, this.e, false);
        atzr.c(parcel, a2);
    }

    public StateUpdate(Type type, JSONObject jSONObject) {
        atzb.s(type);
        this.f = type;
        if (jSONObject != null) {
            this.e = jSONObject.toString();
            return;
        }
        boolean z = true;
        if (!type.equals(Type.CANCEL) && !type.equals(Type.PAUSE) && !type.equals(Type.RESUME) && !type.equals(Type.STOP)) {
            z = false;
        }
        atzb.b(z);
        this.e = null;
    }

    public StateUpdate(String str, String str2) {
        atzb.s(str);
        try {
            this.f = Type.a(str);
            this.e = str2;
        } catch (bdvg e) {
            throw new IllegalArgumentException(e);
        }
    }
}
