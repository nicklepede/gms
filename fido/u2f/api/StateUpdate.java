package com.google.android.gms.fido.u2f.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bcpz;
import defpackage.bcqa;
import defpackage.bcqb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcqb();

    @Deprecated
    public static final StateUpdate a = new StateUpdate(Type.CANCEL);
    public static final StateUpdate b = new StateUpdate(Type.PAUSE);
    public static final StateUpdate c = new StateUpdate(Type.RESUME);
    public static final StateUpdate d = new StateUpdate(Type.STOP);
    public final Type e;
    public final String f;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public enum Type implements Parcelable {
        CANCEL("cancel"),
        PAUSE("pause"),
        RESUME("resume"),
        STOP("stop"),
        DEVICE_SELECTION("user_selected_device"),
        SELECT_VIEW("user_selected_view"),
        SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
        UPDATE_CURRENT_VIEW("update_current_view");

        public static final Parcelable.Creator CREATOR = new bcpz();
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
            throw new bcqa(str);
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

    public final JSONObject a() {
        String str = this.f;
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateUpdate)) {
            return false;
        }
        StateUpdate stateUpdate = (StateUpdate) obj;
        return arwb.b(this.e, stateUpdate.e) && arwb.b(this.f, stateUpdate.f);
    }

    public final int hashCode() {
        Type type = Type.CANCEL;
        return Arrays.hashCode(new Object[]{this.e.i, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        Type type = Type.CANCEL;
        arxc.v(parcel, 2, this.e.i, false);
        arxc.v(parcel, 3, this.f, false);
        arxc.c(parcel, a2);
    }

    public StateUpdate(Type type, JSONObject jSONObject) {
        arwm.s(type);
        this.e = type;
        if (jSONObject != null) {
            this.f = jSONObject.toString();
            return;
        }
        boolean z = true;
        if (!type.equals(Type.CANCEL) && !type.equals(Type.PAUSE) && !type.equals(Type.RESUME) && !type.equals(Type.STOP)) {
            z = false;
        }
        arwm.b(z);
        this.f = null;
    }

    public StateUpdate(String str, String str2) {
        try {
            this.e = Type.a(str);
            this.f = str2;
        } catch (bcqa e) {
            throw new IllegalArgumentException(e);
        }
    }
}
