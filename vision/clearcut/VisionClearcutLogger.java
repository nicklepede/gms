package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.provider.Settings;
import defpackage.apzh;
import defpackage.arvi;
import defpackage.arvq;
import defpackage.arvr;
import defpackage.dkmn;
import defpackage.dkni;
import defpackage.dpwh;
import defpackage.dpxc;
import defpackage.dxxt;
import defpackage.dxyi;
import defpackage.exqa;
import defpackage.fvpb;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class VisionClearcutLogger {
    static final int LAST_EVENT_CODE = 3;
    private static final String LOG_SOURCE = "VISION";
    private static final String USAGE_AND_DIAGNOSTICS_CHECKBOX_NAME = "multi_cb";
    private final dpwh basis;
    private final Context context;
    boolean isUserOptedIn;
    private boolean logToClearcut;
    private final arvr logger;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisionClearcutLogger(Context context) {
        this(context, new arvi(context, LOG_SOURCE).a());
        List list = arvr.n;
    }

    public void log(int i, exqa exqaVar) {
        if (i < 0 || i > 3) {
            dkmn.c("Illegal event code: %d", Integer.valueOf(i));
            return;
        }
        try {
            if (!this.logToClearcut || !this.isUserOptedIn) {
                dkmn.d("Would have logged:\n%s", exqaVar);
                return;
            }
            if (fvpb.a.lK().a()) {
                arvq j = this.logger.j(exqaVar, dpxc.b(apzh.a, this.basis));
                j.l(i);
                j.d();
            } else {
                arvq j2 = this.logger.j(exqaVar, dpxc.b(this.context, this.basis));
                j2.l(i);
                j2.d();
            }
        } catch (Exception e) {
            e.printStackTrace();
            dkmn.b(e, "Failed to log", new Object[0]);
        }
    }

    public void setLogToClearcut(boolean z) {
        this.logToClearcut = z;
    }

    public VisionClearcutLogger(Context context, arvr arvrVar) {
        this.basis = new dkni();
        boolean z = true;
        this.logToClearcut = true;
        this.isUserOptedIn = false;
        this.context = context;
        this.logger = arvrVar;
        dxyi.f(context);
        dxxt.e(context);
        try {
            if (Settings.Global.getInt(context.getContentResolver(), USAGE_AND_DIAGNOSTICS_CHECKBOX_NAME) != 1) {
                z = false;
            }
            this.isUserOptedIn = z;
        } catch (Settings.SettingNotFoundException e) {
            dkmn.b(e, "Couldn't read checkbot setting", new Object[0]);
        }
    }
}
