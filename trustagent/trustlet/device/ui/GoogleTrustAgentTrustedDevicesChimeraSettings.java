package com.google.android.gms.trustagent.trustlet.device.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import defpackage.aby;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.dg;
import defpackage.dixz;
import defpackage.djad;
import defpackage.djce;
import defpackage.djdp;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.ozo;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentTrustedDevicesChimeraSettings extends dixz implements djad, aby {
    private static final ausn m = ausn.b("TrustAgent", auid.TRUSTAGENT);
    djce l;
    private boolean n = false;

    @Override // defpackage.dixv
    protected final ozo a() {
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            int i = extras != null ? extras.getInt("notification_type_key", -1) : -1;
            if (i >= 0) {
                bundle.putInt("notification_type", i);
            }
        }
        djdp djdpVar = new djdp();
        djdpVar.setArguments(bundle);
        return djdpVar;
    }

    @Override // defpackage.djad
    public final void b() {
        l().P();
    }

    @Override // defpackage.aby
    public final /* bridge */ /* synthetic */ void jF(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = activityResult.a;
        if (auub.f()) {
            j.intValue();
            if (i == -11) {
                finish();
                i = -11;
            }
        }
        Intent intent = activityResult.b;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("extra_request_code", 0);
        if (i == -1) {
            if (intExtra != 1002) {
                ((eluo) m.j()).x("Unknown request code");
            } else if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.trustagent.ADD_DEVICE")) {
                Optional e = TrustableDevice.e(intent);
                final djce djceVar = this.l;
                Objects.requireNonNull(djceVar);
                e.ifPresent(new Consumer() { // from class: djcg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj2) {
                        djce.this.a((TrustableDevice) obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.dixv
    protected final String k() {
        return "TrustedDevicesFragment";
    }

    public final djdp l() {
        dg h = getSupportFragmentManager().h("TrustedDevicesFragment");
        ekvl.y(h);
        return (djdp) h;
    }

    @Override // defpackage.dixz, defpackage.dixv, defpackage.dixs, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent();
        this.l = new djce(this);
        if (bundle != null) {
            this.n = bundle.getBoolean("TrustedDeviceDialogActionTakenKey", false);
        }
        hO().h();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.dixv, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.trusted_devices_actions_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.auth_trust_agent_bluetooth_disabled_help_link))));
        return true;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("TrustedDeviceDialogActionTakenKey", this.n);
        super.onSaveInstanceState(bundle);
    }
}
