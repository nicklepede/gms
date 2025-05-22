package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;
import defpackage.cznx;
import defpackage.czor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TaskRef extends cznx implements Task {
    private boolean f;
    private TaskIdRef g;
    private boolean h;
    private DateTimeRef i;
    private boolean j;
    private DateTimeRef k;
    private boolean l;
    private LocationRef m;
    private boolean n;
    private LocationGroupRef o;
    private boolean p;
    private RecurrenceInfoRef q;
    private boolean r;
    private ExternalApplicationLinkRef s;

    public TaskRef(DataHolder dataHolder, int i) {
        super(dataHolder, i, "");
        this.f = false;
        this.h = false;
        this.j = false;
        this.l = false;
        this.n = false;
        this.p = false;
        this.r = false;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean I() {
        return Boolean.valueOf(t(p("snoozed")));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Integer J() {
        return n(p("experiment"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Integer K() {
        return n(p("task_list"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long L() {
        return o(p("archived_time_ms"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long M() {
        return o(p("created_time_millis"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long N() {
        return o(p("due_date_millis"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long O() {
        return o(p("fired_time_millis"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long P() {
        return o(p("location_snoozed_until_ms"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long Q() {
        return o(p("snoozed_time_millis"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final String R() {
        return r(p("title"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final byte[] S() {
        return w(p("assistance"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final byte[] T() {
        return w(p("extensions"));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final DateTime a() {
        if (!this.h) {
            this.h = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (DateTimeRef.k(dataHolder, i, i2, str.concat("due_date_"))) {
                this.i = null;
            } else {
                this.i = new DateTimeRef(dataHolder, this.b, str.concat("due_date_"));
            }
        }
        return this.i;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final DateTime c() {
        if (!this.j) {
            this.j = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (DateTimeRef.k(dataHolder, i, i2, str.concat("event_date_"))) {
                this.k = null;
            } else {
                this.k = new DateTimeRef(dataHolder, this.b, str.concat("event_date_"));
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final ExternalApplicationLink d() {
        if (!this.r) {
            this.r = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (dataHolder.f(ExternalApplicationLinkRef.G(str, "link_application"), i, i2) && dataHolder.f(ExternalApplicationLinkRef.G(str, "link_id"), i, i2)) {
                this.s = null;
            } else {
                this.s = new ExternalApplicationLinkRef(dataHolder, this.b, str);
            }
        }
        return this.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Location e() {
        if (!this.l) {
            this.l = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (dataHolder.f(LocationRef.G(str, "lat"), i, i2) && dataHolder.f(LocationRef.G(str, "lng"), i, i2) && dataHolder.f(LocationRef.G(str, "name"), i, i2) && dataHolder.f(LocationRef.G(str, "radius_meters"), i, i2) && dataHolder.f(LocationRef.G(str, "location_type"), i, i2) && FeatureIdProtoRef.d(dataHolder, i, i2, str.concat("location_")) && dataHolder.f(LocationRef.G(str, "display_address"), i, i2) && AddressRef.j(dataHolder, i, i2, str.concat("address_")) && dataHolder.f(LocationRef.G(str, "location_alias_id"), i, i2)) {
                this.m = null;
            } else {
                this.m = new LocationRef(dataHolder, this.b, str);
            }
        }
        return this.m;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof Task)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TaskEntity.m(this, (Task) obj);
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final LocationGroup f() {
        if (!this.n) {
            this.n = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (dataHolder.f(LocationGroupRef.G(str, "location_query"), i, i2) && dataHolder.f(LocationGroupRef.G(str, "location_query_type"), i, i2) && ChainInfoRef.d(dataHolder, i, i2, str) && CategoryInfoRef.e(dataHolder, i, i2, str)) {
                this.o = null;
            } else {
                this.o = new LocationGroupRef(dataHolder, this.b, str);
            }
        }
        return this.o;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final RecurrenceInfo g() {
        if (!this.p) {
            this.p = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (RecurrenceRef.j(dataHolder, i, i2, str) && dataHolder.f(RecurrenceInfoRef.G(str, "recurrence_id"), i, i2) && dataHolder.f(RecurrenceInfoRef.G(str, "recurrence_master"), i, i2) && dataHolder.f(RecurrenceInfoRef.G(str, "recurrence_exceptional"), i, i2)) {
                this.q = null;
            } else {
                this.q = new RecurrenceInfoRef(dataHolder, this.b, str);
            }
        }
        return this.q;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final TaskId h() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (dataHolder.f(TaskIdRef.G(str, "client_assigned_id"), i, i2) && dataHolder.f(TaskIdRef.G(str, "client_assigned_thread_id"), i, i2)) {
                this.g = null;
            } else {
                this.g = new TaskIdRef(dataHolder, this.b, str);
            }
        }
        return this.g;
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return TaskEntity.b(this);
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean i() {
        return Boolean.valueOf(t(p("archived")));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean j() {
        return Boolean.valueOf(t(p("deleted")));
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean k() {
        return Boolean.valueOf(t(p("pinned")));
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new TaskEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czor.a(new TaskEntity(this), parcel, i);
    }
}
