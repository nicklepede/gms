package com.google.android.gms.significantplaces.settings;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.significantplaces.settings.PlacePickerToolbarChimeraActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.aszs;
import defpackage.atad;
import defpackage.ausn;
import defpackage.bp;
import defpackage.cbqa;
import defpackage.cbqj;
import defpackage.cbre;
import defpackage.cbrh;
import defpackage.cbri;
import defpackage.ccjt;
import defpackage.ceik;
import defpackage.ceil;
import defpackage.ceio;
import defpackage.ceis;
import defpackage.cemm;
import defpackage.cemp;
import defpackage.cemz;
import defpackage.dest;
import defpackage.dete;
import defpackage.detm;
import defpackage.deue;
import defpackage.deut;
import defpackage.deve;
import defpackage.devf;
import defpackage.devg;
import defpackage.devh;
import defpackage.devi;
import defpackage.dhlk;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.edxt;
import defpackage.fuvk;
import defpackage.fxqu;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PlacePickerToolbarChimeraActivity extends rzk implements ceis {
    public ceio j;
    public dest k;
    public aca l;
    public deue m;
    public EditText n;
    private cbqj o;
    private dhlw p;
    private final fxqu q;
    private cemp r;
    private cemz s;
    private final double t;

    public PlacePickerToolbarChimeraActivity() {
        deve deveVar = new deve(this);
        int i = fxya.a;
        this.q = new jxm(new fxxg(devi.class), new devf(this), deveVar, new devg(this));
        this.t = fuvk.b();
    }

    private final void g() {
        dhlw dhlwVar = this.p;
        if (dhlwVar == null) {
            fxxm.j("locationTask");
            dhlwVar = null;
        }
        final fxwo fxwoVar = new fxwo() { // from class: deuw
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                Location location = (Location) obj;
                if (location != null) {
                    ceio ceioVar = PlacePickerToolbarChimeraActivity.this.j;
                    if (ceioVar == null) {
                        fxxm.j("map");
                        ceioVar = null;
                    }
                    ceioVar.i(ceii.b(new LatLng(location.getLatitude(), location.getLongitude()), 17.0f));
                }
                return fxrq.a;
            }
        };
        dhlwVar.z(new dhlq() { // from class: deux
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                fxwo.this.a(obj);
            }
        });
    }

    @Override // defpackage.ceis
    public final void a(ceio ceioVar) {
        this.j = ceioVar;
        ceio ceioVar2 = null;
        if (ceioVar == null) {
            fxxm.j("map");
            ceioVar = null;
        }
        ceioVar.j(true);
        g();
        cemp cempVar = this.r;
        if (cempVar != null) {
            cempVar.a();
        }
        this.r = null;
        cemz cemzVar = this.s;
        if (cemzVar != null) {
            cemzVar.b();
        }
        this.s = null;
        ceio ceioVar3 = this.j;
        if (ceioVar3 == null) {
            fxxm.j("map");
            ceioVar3 = null;
        }
        ceioVar3.l(new ceil() { // from class: deuu
            @Override // defpackage.ceil
            public final void a(int i) {
                PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity = PlacePickerToolbarChimeraActivity.this;
                if (i == 1) {
                    placePickerToolbarChimeraActivity.f(false);
                }
                EditText editText = placePickerToolbarChimeraActivity.n;
                deue deueVar = null;
                if (editText == null) {
                    fxxm.j("editText");
                    editText = null;
                }
                if (editText.hasFocus()) {
                    EditText editText2 = placePickerToolbarChimeraActivity.n;
                    if (editText2 == null) {
                        fxxm.j("editText");
                        editText2 = null;
                    }
                    editText2.clearFocus();
                    Object systemService = placePickerToolbarChimeraActivity.getSystemService("input_method");
                    fxxm.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    EditText editText3 = placePickerToolbarChimeraActivity.n;
                    if (editText3 == null) {
                        fxxm.j("editText");
                        editText3 = null;
                    }
                    inputMethodManager.hideSoftInputFromWindow(editText3.getWindowToken(), 0);
                    deue deueVar2 = placePickerToolbarChimeraActivity.m;
                    if (deueVar2 == null) {
                        fxxm.j("placePickerFragment");
                        deueVar2 = null;
                    }
                    deueVar2.x();
                    deue deueVar3 = placePickerToolbarChimeraActivity.m;
                    if (deueVar3 == null) {
                        fxxm.j("placePickerFragment");
                    } else {
                        deueVar = deueVar3;
                    }
                    deueVar.y();
                }
            }
        });
        ceio ceioVar4 = this.j;
        if (ceioVar4 == null) {
            fxxm.j("map");
        } else {
            ceioVar2 = ceioVar4;
        }
        ceioVar2.k(new ceik() { // from class: deuv
            @Override // defpackage.ceik
            public final void a() {
                PlacePickerToolbarChimeraActivity.this.f(true);
            }
        });
    }

    public final void f(boolean z) {
        ceio ceioVar = null;
        if (this.r == null || this.s == null) {
            ceio ceioVar2 = this.j;
            if (ceioVar2 == null) {
                fxxm.j("map");
                ceioVar2 = null;
            }
            CircleOptions circleOptions = new CircleOptions();
            ceio ceioVar3 = this.j;
            if (ceioVar3 == null) {
                fxxm.j("map");
                ceioVar3 = null;
            }
            circleOptions.a(ceioVar3.d().a);
            circleOptions.b = this.t;
            circleOptions.c();
            circleOptions.b();
            circleOptions.d();
            this.r = ceioVar2.e(circleOptions);
            ceio ceioVar4 = this.j;
            if (ceioVar4 == null) {
                fxxm.j("map");
                ceioVar4 = null;
            }
            MarkerOptions markerOptions = new MarkerOptions();
            ceio ceioVar5 = this.j;
            if (ceioVar5 == null) {
                fxxm.j("map");
                ceioVar5 = null;
            }
            markerOptions.a(ceioVar5.d().a);
            markerOptions.b = getString(R.string.significant_places_place_picker_marker_title);
            markerOptions.d = cemm.b(2131233854);
            cemz g = ceioVar4.g(markerOptions);
            this.s = g;
            if (g != null) {
                g.e();
            }
        }
        cemp cempVar = this.r;
        if (cempVar != null) {
            ceio ceioVar6 = this.j;
            if (ceioVar6 == null) {
                fxxm.j("map");
                ceioVar6 = null;
            }
            cempVar.b(ceioVar6.d().a);
        }
        cemp cempVar2 = this.r;
        if (cempVar2 != null) {
            cempVar2.c(z);
        }
        cemz cemzVar = this.s;
        if (cemzVar != null) {
            ceio ceioVar7 = this.j;
            if (ceioVar7 == null) {
                fxxm.j("map");
            } else {
                ceioVar = ceioVar7;
            }
            cemzVar.c(ceioVar.d().a);
        }
        cemz cemzVar2 = this.s;
        if (cemzVar2 != null) {
            cemzVar2.d(z);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ausn ausnVar = detm.a;
        if (i == 1387388555 && i2 == -1) {
            cbqj cbqjVar = this.o;
            if (cbqjVar == null) {
                fxxm.j("flpClient");
                cbqjVar = null;
            }
            cbqa cbqaVar = new cbqa();
            cbqaVar.d(102);
            cbqaVar.c(60000L);
            cbqaVar.e(2);
            this.p = cbqjVar.b(cbqaVar.a(), null);
            g();
        }
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dete.a;
        dete.c(this);
        getContainerActivity();
        int i2 = edxt.a;
        aszs aszsVar = cbrh.a;
        this.o = new ccjt(this);
        setContentView(R.layout.significant_places_place_picker);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.map_container, new deut());
        bpVar.a();
        cbqj cbqjVar = this.o;
        EditText editText = null;
        if (cbqjVar == null) {
            fxxm.j("flpClient");
            cbqjVar = null;
        }
        this.p = cbqjVar.c();
        this.k = new dest();
        this.l = registerForActivityResult(new acq(), new aby() { // from class: deuy
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "result");
                if (activityResult.a == -1) {
                    PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity = PlacePickerToolbarChimeraActivity.this;
                    placePickerToolbarChimeraActivity.setResult(-1);
                    int i3 = dete.a;
                    dete.b(placePickerToolbarChimeraActivity);
                }
            }
        });
        MaterialButton materialButton = super.gR().d;
        if (materialButton != null) {
            materialButton.setVisibility(0);
        }
        CharSequence text = getText(R.string.significant_places_button_text_use_this_place);
        MaterialButton materialButton2 = super.gR().d;
        if (materialButton2 != null) {
            materialButton2.setText(text);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: deuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity = PlacePickerToolbarChimeraActivity.this;
                ceio ceioVar = placePickerToolbarChimeraActivity.j;
                if (ceioVar == null) {
                    fxxm.j("map");
                    ceioVar = null;
                }
                double d = ceioVar.d().a.a;
                ceio ceioVar2 = placePickerToolbarChimeraActivity.j;
                if (ceioVar2 == null) {
                    fxxm.j("map");
                    ceioVar2 = null;
                }
                double d2 = ceioVar2.d().a.b;
                fgrc v = fjym.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                ((fjym) fgriVar).b = d;
                if (!fgriVar.L()) {
                    v.U();
                }
                ((fjym) v.b).c = d2;
                fgri Q = v.Q();
                fxxm.e(Q, "build(...)");
                fycr.b(jvd.a(placePickerToolbarChimeraActivity), null, null, new devd(placePickerToolbarChimeraActivity, (fjym) Q, null), 3);
            }
        };
        MaterialButton materialButton3 = super.gR().d;
        if (materialButton3 != null) {
            materialButton3.setOnClickListener(onClickListener);
        }
        findViewById(R.id.button_use_this_place).setVisibility(8);
        atad atadVar = new atad(this, (float[][]) null);
        cbri cbriVar = new cbri();
        cbre cbreVar = new cbre(0L);
        cbreVar.k(102);
        cbriVar.b(cbreVar.a());
        atadVar.ae(cbriVar.a()).x(new dhlk() { // from class: deva
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                if (dhlwVar.m()) {
                    return;
                }
                Exception h = dhlwVar.h();
                atas atasVar = h instanceof atas ? (atas) h : null;
                if (atasVar != null) {
                    atasVar.c(PlacePickerToolbarChimeraActivity.this.getContainerActivity(), 1387388555);
                }
            }
        });
        this.n = (EditText) findViewById(R.id.edit_text_enter_address);
        ((devi) this.q.a()).a.g(this, new devh(new fxwo() { // from class: devb
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                PlacePickerToolbarChimeraActivity placePickerToolbarChimeraActivity = PlacePickerToolbarChimeraActivity.this;
                dexp dexpVar = (dexp) obj;
                deue deueVar = placePickerToolbarChimeraActivity.m;
                ceio ceioVar = null;
                if (deueVar == null) {
                    fxxm.j("placePickerFragment");
                    deueVar = null;
                }
                deueVar.y();
                EditText editText2 = placePickerToolbarChimeraActivity.n;
                if (editText2 == null) {
                    fxxm.j("editText");
                    editText2 = null;
                }
                editText2.clearFocus();
                EditText editText3 = placePickerToolbarChimeraActivity.n;
                if (editText3 == null) {
                    fxxm.j("editText");
                    editText3 = null;
                }
                editText3.setText(dexpVar.f);
                deue deueVar2 = placePickerToolbarChimeraActivity.m;
                if (deueVar2 == null) {
                    fxxm.j("placePickerFragment");
                    deueVar2 = null;
                }
                deueVar2.x();
                ceio ceioVar2 = placePickerToolbarChimeraActivity.j;
                if (ceioVar2 == null) {
                    fxxm.j("map");
                } else {
                    ceioVar = ceioVar2;
                }
                fjym fjymVar = dexpVar.d;
                if (fjymVar == null) {
                    fjymVar = fjym.a;
                }
                double d = fjymVar.b;
                fjym fjymVar2 = dexpVar.d;
                if (fjymVar2 == null) {
                    fjymVar2 = fjym.a;
                }
                ceioVar.i(ceii.b(new LatLng(d, fjymVar2.c), 17.0f));
                return fxrq.a;
            }
        }));
        this.m = new deue();
        bp bpVar2 = new bp(getSupportFragmentManager());
        deue deueVar = this.m;
        if (deueVar == null) {
            fxxm.j("placePickerFragment");
            deueVar = null;
        }
        bpVar2.F(R.id.search_container, deueVar);
        bpVar2.a();
        EditText editText2 = this.n;
        if (editText2 == null) {
            fxxm.j("editText");
        } else {
            editText = editText2;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: devc
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    deue deueVar2 = PlacePickerToolbarChimeraActivity.this.m;
                    if (deueVar2 == null) {
                        fxxm.j("placePickerFragment");
                        deueVar2 = null;
                    }
                    deueVar2.z();
                }
            }
        });
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fxxm.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        int i = dete.a;
        dete.b(this);
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        int i = dete.a;
        dete.d(this);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        int i = dete.a;
        dete.e(this);
        super.onStop();
    }
}
