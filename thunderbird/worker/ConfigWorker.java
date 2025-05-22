package com.google.android.gms.thunderbird.worker;

import android.location.Location;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import com.google.android.gms.thunderbird.worker.ConfigWorker;
import defpackage.aupk;
import defpackage.ausn;
import defpackage.bsj;
import defpackage.bzkk;
import defpackage.cbrd;
import defpackage.digh;
import defpackage.dikw;
import defpackage.dilt;
import defpackage.dinb;
import defpackage.dinc;
import defpackage.dinq;
import defpackage.dinr;
import defpackage.dinx;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.elgo;
import defpackage.elja;
import defpackage.elso;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgn;
import defpackage.fvik;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ConfigWorker extends dinx implements GmsAlarmManagerCompat$OnAlarmListener, cbrd {
    public final digh a;
    public final Collection b;
    public final dinb c;
    public EmergencyInfo d;
    public int e;
    public Location f;
    public long g;
    public boolean h;
    private final Map j;
    private boolean k;
    private boolean l;
    private eqgl m;
    private eqgn n;
    private dilt o;
    private boolean p;
    private Location q;
    private boolean r;
    private ekvi s;

    public ConfigWorker(dinq dinqVar, digh dighVar, EmergencyInfo emergencyInfo) {
        super(dinqVar);
        ekvl.y(dighVar);
        this.a = dighVar;
        this.d = emergencyInfo;
        this.j = new bsj(2);
        this.b = new ArrayList(2);
        this.c = new dinb(this);
        this.s = ektg.a;
        this.e = 0;
        long j = dighVar.l;
        this.g = Math.min(j == 0 ? fvik.a.lK().g() : j, fvik.b());
    }

    private final boolean A() {
        int i = this.e;
        ekvl.s(i >= 2, "isTrackingComplete: state must be >= STATE_TRACKING, but is %s", i);
        return this.e > 2 || this.a.x == 0 || q() >= this.g;
    }

    private final boolean B(Location location) {
        return location != null && s(location) == dinc.VALID;
    }

    private final dinc s(Location location) {
        if (location == null) {
            return dinc.NULL;
        }
        digh dighVar = this.a;
        return (dighVar.b || !location.isFromMockProvider() || fvik.a.lK().H()) ? !location.hasAccuracy() ? dinc.NO_ACCURACY : location.getAccuracy() <= 0.0f ? dinc.INVALID_ACCURACY : location.getAccuracy() > 20000.0f ? dinc.TOO_INACCURATE : dikw.a(location) < -5000 ? dinc.TOO_RECENT : dikw.a(location) >= dighVar.b() ? dinc.TOO_STALE : dinc.VALID : dinc.MOCK;
    }

    private final void t() {
        boolean z = false;
        if (this.e == 2 && A()) {
            z = true;
        }
        ekvl.w(z, "completeTracking: state must be STATE_TRACKING and isTrackingComplete() must be true. State is %s, isTrackingComplete() returned %s.", Integer.toString(this.e), Boolean.valueOf(A()));
        k(3);
    }

    private final void u() {
        eqgn eqgnVar = this.n;
        if (eqgnVar != null) {
            eqgnVar.cancel(true);
            this.n = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r4 == 0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(defpackage.dinr r11, android.location.Location r12) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.thunderbird.worker.ConfigWorker.v(dinr, android.location.Location):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.thunderbird.worker.ConfigWorker.w():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [eqgl, java.lang.Object] */
    private final void x() {
        if (this.e != 1) {
            if (this.s.h()) {
                this.s.c().cancel(false);
                this.s = ektg.a;
                return;
            }
            return;
        }
        long a = this.a.a() - q();
        if (this.s.h() || a <= 0) {
            return;
        }
        eqgn schedule = ka().a.schedule(new Runnable() { // from class: dimw
            @Override // java.lang.Runnable
            public final void run() {
                ConfigWorker configWorker = ConfigWorker.this;
                if (configWorker.e == 1 && configWorker.p()) {
                    configWorker.g(true);
                }
            }
        }, a, TimeUnit.MILLISECONDS);
        aupk.c(schedule);
        this.s = ekvi.j(schedule);
    }

    private final void y() {
        if (this.e == 2) {
            ausn ausnVar = dikw.a;
            ka().d().e("TrackingComplete", jY().f + this.g, ka().a, this);
            this.r = true;
        } else if (this.r) {
            ka().d().d(this);
            this.r = false;
        }
    }

    private final boolean z() {
        int i = this.e;
        ekvl.s(i >= 3, "isPendingFinishedComplete: state must be >= STATE_PENDING_FINISHED, but is %s", i);
        ekvl.r(this.j.isEmpty(), "isPendingFinishedComplete: scheduledReports must be empty");
        if (this.e > 3) {
            return true;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (!((eqgl) it.next()).isDone()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(bzkk bzkkVar) {
        int i = this.e;
        ekvl.s(i == 2, "onAlarm: state must be STATE_TRACKING, but is %s", i);
        if (!A()) {
            y();
        } else {
            ((eluo) ((eluo) dikw.a.h()).ai((char) 11350)).B("%s maximum tracking delta expired", this);
            t();
        }
    }

    public final dinr c() {
        return new dinr(this, q());
    }

    public final void e() {
        if (this.e >= 4) {
            return;
        }
        Map map = this.j;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((eqgn) it.next()).cancel(true);
        }
        map.clear();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((eqgl) it2.next()).cancel(true);
        }
        k(5);
    }

    public final void f() {
        int i = this.e;
        if (i > 3) {
            return;
        }
        boolean z = false;
        if (i == 3 && z()) {
            z = true;
        }
        ekvl.w(z, "completePendingFinished: state must be STATE_PENDING_FINISHED and isPendingFinishedComplete() must be true. State is %s, isPendingFinishedComplete() returned %s.", Integer.toString(this.e), Boolean.valueOf(z()));
        ekvl.r(!this.l, "completePendingFinished: locationRequest already set");
        ekvl.r(!this.r, "completePendingFinished: trackingCompleteAlarm already set");
        k(4);
    }

    public final void g(boolean z) {
        boolean z2 = false;
        if (this.e == 1 && p()) {
            z2 = true;
        }
        ekvl.w(z2, "completeSampling: state must be STATE_SAMPLING and isSamplingComplete() must be true. State is %s, isSamplingComplete() returned %s.", Integer.toString(this.e), Boolean.valueOf(p()));
        if (this.b.isEmpty() && this.q == null) {
            if (!this.a.r.b()) {
                e();
                return;
            } else if (z) {
                ((eluo) ((eluo) dikw.a.h()).ai((char) 11347)).B("%s unable to derive any location - sending empty report", this);
                v(c(), null);
            }
        }
        k(2);
    }

    public final void h(String str) {
        if (o()) {
            return;
        }
        this.d = this.d.i(str);
        m(null);
    }

    public final void i(final dinr dinrVar) {
        int i = this.e;
        ekvl.s(i < 3, "scheduleReport: state must be < STATE_PENDING_FINISHED, but is %s", i);
        Map map = this.j;
        ekvl.r(!map.containsKey(dinrVar), "scheduleReport: scheduledReports must not contain key reportWorker");
        long q = dinrVar.a - q();
        ((eluo) ((eluo) dikw.a.h()).ai(11355)).O("%s scheduled work in %dms", dinrVar, q);
        if (q <= 0) {
            l(dinrVar);
            return;
        }
        eqgn schedule = ka().a.schedule(new Runnable() { // from class: dimt
            @Override // java.lang.Runnable
            public final void run() {
                ConfigWorker.this.l(dinrVar);
            }
        }, q, TimeUnit.MILLISECONDS);
        aupk.c(schedule);
        if (schedule.isDone()) {
            return;
        }
        map.put(dinrVar, schedule);
    }

    public final void j(long j) {
        if (j == this.g) {
            return;
        }
        this.g = Math.min(j, fvik.b());
        if (this.e == 2) {
            if (A()) {
                t();
            } else {
                y();
            }
        }
    }

    @Override // defpackage.dinx, defpackage.dinw
    public final ActivationInfo jY() {
        return this.d.a;
    }

    @Override // defpackage.dinx, defpackage.dinw
    public final String jZ() {
        return super.jZ() + ":" + this.a.a + ":" + elja.j(this.d.b, new ekut() { // from class: dimz
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return ((DeviceState) obj).h();
            }
        }).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i) {
        int i2 = i;
        ekvl.a(i2 > this.e);
        ekvl.r(this.j.isEmpty(), "setState: scheduledReports must be empty");
        if (i2 == 4) {
            int i3 = this.e;
            ekvl.s(i3 == 3, "setState: state must be STATE_PENDING_FINISHED, but is %s", i3);
            i2 = 4;
        }
        this.e = i2;
        ausn ausnVar = dikw.a;
        eluo eluoVar = (eluo) ((eluo) ausnVar.h()).ai(11359);
        int i4 = this.e;
        eluoVar.P("%s state switched to %s", this, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "CANCELED" : "FINISHED" : "PENDING_FINISHED" : "TRACKING" : "SAMPLING" : "READY");
        int i5 = this.e;
        if (i5 == 1) {
            ekvl.s(true, "scheduleSamplingModeReports: state must be STATE_SAMPLING, but is %s", 1);
            digh dighVar = this.a;
            elso it = ((elgo) dighVar.w).iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                long longValue = l.longValue();
                if (longValue < 0 || longValue > dighVar.a()) {
                    ((eluo) ((eluo) ausnVar.j()).ai(11356)).T("%s delta %dms is not in range [0, %d]ms", this, l, Long.valueOf(dighVar.a()));
                } else {
                    i(new dinr(this, longValue));
                }
            }
            this.k = true;
            if (p()) {
                g(false);
                return;
            } else {
                w();
                x();
                return;
            }
        }
        if (i5 == 2) {
            if (fvik.s()) {
                int i6 = this.e;
                ekvl.s(i6 == 2, "scheduleTrackingModeReports: state must be STATE_TRACKING, but is %s", i6);
                long j = this.a.x;
                if (j == 0) {
                    ((eluo) ((eluo) ausnVar.h()).ai((char) 11358)).x("scheduleTrackingModeReports: no tracking period configured");
                } else if (this.n != null) {
                    ((eluo) ((eluo) ausnVar.j()).ai((char) 11357)).x("scheduleTrackingModeReports: tracking future already scheduled");
                } else {
                    this.n = ka().a.scheduleWithFixedDelay(new Runnable() { // from class: dimy
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConfigWorker configWorker = ConfigWorker.this;
                            if (configWorker.e == 2) {
                                ((eluo) ((eluo) dikw.a.h()).ai((char) 11348)).x("scheduleTrackingModeReports: schedule immediate report");
                                configWorker.i(configWorker.c());
                            }
                        }
                    }, j, j, TimeUnit.MILLISECONDS);
                }
            }
            if (A()) {
                t();
                return;
            } else {
                w();
                y();
                return;
            }
        }
        if (i5 == 3) {
            w();
            if (fvik.s()) {
                u();
            }
            y();
            x();
            if (z()) {
                f();
                return;
            } else {
                aupk.c(eqgc.a(this.b).c(new Runnable() { // from class: dimx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConfigWorker.this.f();
                    }
                }, ka().a));
                return;
            }
        }
        if (i5 == 4) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 11361)).B("%s config complete", this);
            this.c.c();
        } else if (i5 == 5) {
            w();
            if (fvik.s()) {
                u();
            }
            y();
            x();
            ((eluo) ((eluo) ausnVar.h()).ai((char) 11360)).B("%s config canceled", this);
            this.c.c();
        }
    }

    public final void l(dinr dinrVar) {
        int i = this.e;
        ekvl.s(i < 3, "startReport: state must be < STATE_PENDING_FINISHED, but is %s", i);
        this.j.remove(dinrVar);
        Location location = this.q;
        if (m(location)) {
            return;
        }
        if (!fvik.a.lK().aU() ? !B(location) : !(location != null && dikw.a(location) < fvik.h())) {
            this.p = true;
            v(dinrVar, location);
        } else {
            ((eluo) ((eluo) dikw.a.h()).ai((char) 11362)).B("%s no location to report", dinrVar);
        }
        if (this.e == 1 && p()) {
            g(true);
        }
    }

    public final boolean m(Location location) {
        if (this.p || this.a.c(ka(), this.d, location) != null) {
            return false;
        }
        ((eluo) ((eluo) dikw.a.h()).ai((char) 11346)).B("%s no longer matched by emergency", this);
        e();
        return true;
    }

    public final boolean n() {
        return this.e == 5;
    }

    public final boolean o() {
        int i = this.e;
        return i == 4 || i == 5;
    }

    @Override // defpackage.cbrd
    public final void onLocationChanged(Location location) {
        int i = this.e;
        if (i != 1 && i != 2) {
            ((eluo) ((eluo) dikw.a.j()).ai(11354)).z("rejecting incoming location: state must be STATE_SAMPLING or STATE_TRACKING, but is %s", this.e);
            return;
        }
        if (!B(location)) {
            ((eluo) ((eluo) dikw.a.h()).ai(11353)).P("%s rejecting incoming location with validity %s", this, s(location));
            return;
        }
        if (this.f == null) {
            this.f = location;
        }
        this.q = location;
        int i2 = this.e;
        if (i2 == 1) {
            if (this.a.v && this.b.isEmpty()) {
                ((eluo) ((eluo) dikw.a.h()).ai((char) 11352)).B("%s first time location", this);
                i(c());
                return;
            }
            return;
        }
        if (i2 == 2) {
            ausn ausnVar = dikw.a;
            if (fvik.s()) {
                return;
            }
            i(c());
        }
    }

    public final boolean p() {
        int i = this.e;
        ekvl.s(i > 0, "isSamplingComplete: state must be >= STATE_SAMPLING, but is %s", i);
        if (this.e > 1) {
            return true;
        }
        digh dighVar = this.a;
        return !(dighVar.v && this.q == null && q() < dighVar.a()) && this.k && this.j.isEmpty();
    }
}
